package com.personal.rulengine.mamager.controller.order;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.util.Streams;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
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

//    @Autowired
    private ITestEntityService iTestEntityService;
    
    @Resource
    private ThreadPoolTaskExecutor taskExecutor; 
    

    /**
     * 测试文件下载类型请求,直接显示文件信息到浏览器中
     */
    @RequestMapping(value = "/download1")
    @ResponseBody
    public void download(OutputStream out ) {
        logger.info("@RequestMapping:/test/download1执行了...");
        
        String pathname="D:\\temp\\VerifyCode.jpg";
        InputStream in=null;
        try {
            in = new  FileInputStream(new File(pathname));
            FileCopyUtils.copy(in, out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * 直接下载文件
     * http://localhost:8080/rulengine-mamager/server/test/download2
     */
    @RequestMapping(value = "/download2")
    @ResponseBody
    public void download2(OutputStream out,HttpServletResponse response ) {
        logger.info("@RequestMapping:/test/download2执行了...");
        
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/force-download");
        response.setHeader("Content-Disposition", "attachement;filename=download.jpg");
        
        String pathname="D:\\temp\\VerifyCode.jpg";
        InputStream in=null;
        try {
            in = new  FileInputStream(new File(pathname));
            //int length = FileCopyUtils.copy(in, out);
            //或者如下
            long length = Streams.copy(in, out, true);
            logger.warn("length is:{}",length);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    /**
     * 测试传递List或者String[]格式的数据请求解析
     * http://localhost:8080/rulengine-mamager/server/test/names1?name=1&name=liubao&name=wangli
     */
    @RequestMapping(value = "/names1")
    @ResponseBody
    public Object names1(@RequestParam("name")String[] names ) {
        logger.info("@RequestMapping:/test/names1执行了...");
        logger.info("参数信息为:{}",JSON.toJSONString(names));
        return ResultInfoUtil.setErrorInfo(ErrorCodeConsField.ERROR_MSG_10003, 
                getMessage(ErrorCodeConsField.ERROR_MSG_10003));
    }
    @RequestMapping(value = "/names2")
    @ResponseBody
    public Object names2(@RequestParam("name")List<String> names ) {
        logger.info("@RequestMapping:/test/names2执行了...");
        logger.info("参数信息为:{}",JSON.toJSONString(names));
        return ResultInfoUtil.setErrorInfo(ErrorCodeConsField.ERROR_MSG_10003, 
                getMessage(ErrorCodeConsField.ERROR_MSG_10003));
    }
    
    
    @RequestMapping(value = "/webrequest")
    @ResponseBody
    public Object webrequest(WebRequest request ) {
        logger.info("@RequestMapping:/test/webrequest执行了...");
        String username = request.getParameter("username");
        Map<String, String[]> parameterMap = request.getParameterMap();
        logger.warn(username);
        logger.warn(parameterMap.toString());
        return ResultInfoUtil.setErrorInfo(ErrorCodeConsField.ERROR_MSG_10003, 
                getMessage(ErrorCodeConsField.ERROR_MSG_10003));
    }
    
    /**
     */
    @RequestMapping(value = "/welcome")
    @ResponseBody
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
