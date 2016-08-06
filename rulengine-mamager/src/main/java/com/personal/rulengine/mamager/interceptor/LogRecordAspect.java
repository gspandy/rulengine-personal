package com.personal.rulengine.mamager.interceptor;

import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;

/**
 * Controller请求参数及响应参数日志打印拦截器
 * 
 * @Author LiuBao
 * @Version 0.1
 * @Comp personal
 * @Date 2016年7月22日下午5:33:16
 *
 */
@Aspect
@Component
@Order(1)
public class LogRecordAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@SuppressWarnings({ "unchecked", "rawtypes" })
    @Before(value="(execution(* com.personal.rulengine.mamager.controller..*.*(..))) ")  
	public void before(JoinPoint joinPoint) {
		String url = null;
		try {
			url = generateUrl(joinPoint);
		} catch (Exception e) {
		    logger.error("解析请求url信息异常!",e);
		}
		if(url!=null){
			List<Object> objs = new ArrayList<Object>();
			for (Object obj : joinPoint.getArgs()) {
				if (obj instanceof MultipartFile) {
				    MultipartFile commFile = (MultipartFile) obj;
					Map map = new HashMap();
					//上传form的name属性
					map.put("name", commFile.getName());
					map.put("contentType", commFile.getContentType());
					map.put("originalFilename", commFile.getOriginalFilename());
					map.put("size", commFile.getSize());
					objs.add(map);
				} else if(obj instanceof ServletResponse
				        ||obj instanceof ModelAndView
				        ||obj instanceof Model
				        ||obj instanceof PrintWriter
				        ){
				    continue;
				}else if(obj instanceof ServletRequest
                        ){
				    try {
                        Map<String, Object> map = getMapFromRequest((HttpServletRequest)obj);
                        objs.add(map);
                    } catch (Exception e) {
                        logger.error("解析HttpServletRequest信息异常!",e);
                    }
                }else{
					objs.add(obj);
				}
			}
	
			String jsonString="{}";
			try {
				jsonString = JSON.toJSONString(objs,true);
			} catch (Exception e) {
			    logger.error("JSON数据格式化异常!",e);
			}
			
			logger.info("\n");
			logger.info("##########################################################");
			logger.info("######## request url: " + url);
			logger.info("######## request param:\r\n " + jsonString);
			logger.info("##########################################################");
			logger.info("\n");
		}
	}
	
	@AfterReturning(value="(execution(* com.personal.rulengine.mamager.controller..*.*(..)))",argNames="joinPoint,retValue", returning="retValue")  
	public void after(JoinPoint joinPoint,Object retValue) {
		String generateUrlJson =  null;
		try {
		   generateUrlJson = generateUrl(joinPoint);
		} catch (Exception e) {
		    logger.error("解析请求url信息异常!",e);
		}
		//String jsonString = JSON.toJSONString(retValue,true);
		String jsonString = JSON.toJSONString(retValue,true);
		if(jsonString.length()>1000){
			jsonString="jsonString.length:"+jsonString.length();
		}
		if(generateUrlJson!=null){
			logger.info("\n");
			logger.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			logger.info("@@@@@@@@ response (request url): " + generateUrlJson);
			logger.info("@@@@@@@@ response value: \r\n" + jsonString);
			logger.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		}
	}

	private String generateUrl(JoinPoint joinPoint) {
		String url = "";

		RequestMapping requestMappingMethod = null;
		RequestMapping requestMappingClass = null;

		Class<?> cls = joinPoint.getTarget().getClass();
		requestMappingClass = cls.getAnnotation(RequestMapping.class);
		Method[] methods = cls.getMethods();
		String methodName = joinPoint.getSignature().getName();
		for (Method m : methods) {
			// 获取执行方法前的注解信息。
			if (m.getName().equals(methodName)) {
				requestMappingMethod = m.getAnnotation(RequestMapping.class);
				break;
			}
		}
		
		String[] valueClasses = requestMappingClass.value();
		String[] valueMethods = requestMappingMethod.value();
		if (valueClasses.length > 0) {
			url = url.concat(valueClasses[0]);
		}
		if (valueMethods.length > 0) {
			url = url.concat(valueMethods[0]);
		}
		return url;
	}

    /**
     * 解析request对象请求参数信息
     */
    private Map<String ,Object> getMapFromRequest(HttpServletRequest request) throws Exception{
        Map<String, String[]> requestMap = request.getParameterMap();
        Map<String ,Object> resultMap = new HashMap<String ,Object>();
        if (requestMap != null) {
            for (String key : requestMap.keySet()) {
                String[] values = requestMap.get(key);
                resultMap.put(key, values.length == 1 ? values[0].trim() : values);
            }
        }
        return resultMap;
    }
	

}
