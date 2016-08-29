package com.personal.rulengine.mamager.controller.order;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * XMLEntity访问记录信息Controller
 * 
 * @author LiuBao
 * @version 1.0.0
 * @Date 2016年3月24日
 *
 */
@Controller
@RequestMapping("/test")
public class TestXMLEntityController {
    
    private Logger logger = LoggerFactory.getLogger(TestXMLEntityController.class);

    @Resource
    private ThreadPoolTaskExecutor taskExecutor; 

    /**
     * consumes： 指定处理请求的提交内容类型（Content-Type），例如application/json, text/html;
     * produces:    指定返回的内容类型，仅当request请求头中的(Accept)类型中包含该指定类型才返回；
     * 该请求为POST请求,必须包含消息头为:application/xml,且响应数据只能为xml格式数据,故请求地址必须以xml结尾;
     * http://localhost:8080/rulengine-mamager/server/test/xml/post.xml
     * 错误地址:
     * http://localhost:8080/rulengine-mamager/server/test/xml/post.json
     * http://localhost:8080/rulengine-mamager/server/test/xml/post
     */
    @RequestMapping(value = "/xml/post", method = RequestMethod.POST, consumes = "application/xml", produces = "application/xml")
    public @ResponseBody Birth getXMLByPost() {
        logger.warn(this.getClass().getSimpleName()+"执行了...");
        return new Birth("中国");
    }

    /**
     * http://localhost:8080/rulengine-mamager/server/test/xml/post1.json
     * http://localhost:8080/rulengine-mamager/server/test/xml/post1.xml
     * 
     * 1.Content-Type: application/json
     * {"country":"中国"}
     * 
     */
    @RequestMapping(value = "/xml/post1", method = RequestMethod.POST)
    public @ResponseBody AccountBean getXMLByPostParam(@RequestBody Birth brith) {
        AccountBean accountBean = new AccountBean();
        accountBean.setBrith(brith);
        accountBean.setEmail("liubao@j1.com");
        accountBean.setId(10);
        accountBean.setName("liubao");
        return accountBean;
    }
    
    /**
     * 只支持GET请求方式
     * http://localhost:8080/rulengine-mamager/server/test/xml/get.xml
     * http://localhost:8080/rulengine-mamager/server/test/xml/get.json
     * 默认为json格式数据:
     * http://localhost:8080/rulengine-mamager/server/test/xml/get
     */
    @RequestMapping(value = "/xml/get", method = RequestMethod.GET)
    public @ResponseBody Birth getXMLByGet() {
        return new Birth("中国");
    }

    /**
     * http://localhost:8080/rulengine-mamager/server/test/xml/get1.json?name=liubao
     * http://localhost:8080/rulengine-mamager/server/test/xml/get1.xml?name=liubao
     */
    @RequestMapping(value = "/xml/get1", method = RequestMethod.GET)
    public @ResponseBody AccountBean getXMLByGetParam( String name) {
        AccountBean accountBean = new AccountBean();
        Birth birth = new Birth("中国");
        accountBean.setBrith(birth);
        accountBean.setEmail("liubao@j1.com");
        accountBean.setId(10);
        accountBean.setName(name);
        return accountBean;
    }
    
}
