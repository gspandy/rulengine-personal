package com.personal.rulengine.mamager.interceptor;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.personal.rulengine.mamager.controller.result.ErrorCodeConsField;
import com.personal.rulengine.mamager.controller.result.ResultInfoUtil;

/**
 * 全局异常处理器
 * 
 * @Author LiuBao
 * @Version 0.1
 * @Comp personal
 * @Date 2016年7月22日下午3:57:38
 *
 */
public class SvrHandlerExceptionResolver implements HandlerExceptionResolver {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
	@Autowired
	private MessageSource messageSource;
	
	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		
		String errorCode = "90000";
		String defaultMessage =  "未定义异常信息!";
		String errorMessage =  "NO";
		
		if(ex instanceof UndeclaredThrowableException) {
			UndeclaredThrowableException undeclaredThrowableException	= (UndeclaredThrowableException)ex;
			Throwable throwable = undeclaredThrowableException.getUndeclaredThrowable();
			/*if(throwable instanceof TranFailException) {
			    errorCode = ((TranFailException)throwable).getErrorCode();
			    errorMessage = throwable.getMessage();
			}*/
			logger.error("Catch Exception: ",throwable);
		}else if(ex instanceof RuntimeException){
		    //把漏网的异常信息记入日志 
		   logger.error("Catch Exception: ",ex);
		}else{
	           logger.error("Catch Exception: ",ex);
	        }
        PrintWriter writer;
		try {
			response.setHeader("Content-type", "text/html;charset=UTF-8"); 
			response.setCharacterEncoding("UTF-8"); 
			writer = response.getWriter();
			errorMessage=messageSource.getMessage(errorCode, null, defaultMessage, Locale.CHINA);
			
			//String retJson = "{\"errorCode\": \""+errorCode+"\",\"errorMessage\": \""+errorMessage+"\"}";
			String retJson =JSON.toJSONString(ResultInfoUtil.setErrorInfo(errorCode, errorMessage),true);
			logger.info("\n");
			logger.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			logger.info("@@@@@@@@ response (request url): " + request.getRequestURI());
			logger.info("@@@@@@@@ response value: \r\n" + retJson);
			logger.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	        writer.write(retJson);
	        writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
        return null;
	}

}
