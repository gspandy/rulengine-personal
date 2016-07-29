package com.personal.rulengine.mamager.controller.order;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.personal.rulengine.mamager.controller.base.CommonController;
import com.personal.rulengine.mamager.controller.result.ErrorCodeConsField;
import com.personal.rulengine.mamager.controller.result.ResultInfoUtil;
import com.personal.rulengine.server.api.ITestEntityService;

/**
 * testEntity访问记录信息Controller
 * @RestController("/test"):适用于所有的请求都是返回json格式的数据的请求,
 * 请求方法中可以不必注解 @ResponseBody
 * 
 * @author LiuBao
 * @version 1.0.0
 * @Date 2016年3月24日
 *
 */
@Controller
@RequestMapping("/test")
public class TestEntityController extends CommonController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ITestEntityService iTestEntityService;
    
    @Resource
    private ThreadPoolTaskExecutor taskExecutor; 
    

    /**
     * 上传测试首页
     */
   
    @RequestMapping(value = "/welcome")
    public Object uploadIndex(ModelAndView mav) {
        logger.info("@RequestMapping:/test/welcome执行了...");
        return ResultInfoUtil.setErrorInfo(ErrorCodeConsField.ERROR_MSG_10003, 
                getMessage(ErrorCodeConsField.ERROR_MSG_10003));
        //return new ModelAndView("/jsp/upload_txt");
        //return "/jsp/upload_txt";
    }
    
    
    @ResponseBody
    @RequestMapping(value="/getTotalCount/0",method={RequestMethod.GET,RequestMethod.POST})
    public Object getTotalCount(@RequestHeader Map<String,Object> headerMap ,@RequestParam(required=true,value="uuid") String uuid )throws Exception{
        logger.info("/test/getTotalCount/@RequestHeader:\r\n{}",JSON.toJSONString(headerMap,true));
        if(StringUtils.isBlank(uuid)){
            //throw new RuntimeException("自定义异常!!!");
            return ResultInfoUtil.setErrorInfo(ErrorCodeConsField.ERROR_MSG_10003, 
                    getMessage(ErrorCodeConsField.ERROR_MSG_10003));
        }
        
        long totalCount = iTestEntityService.getTotalCount();
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("totalCount", totalCount);
        //return ResultInfoUtil.setSuccessInfo(resultMap);
        return totalCount;
    }
    
}
