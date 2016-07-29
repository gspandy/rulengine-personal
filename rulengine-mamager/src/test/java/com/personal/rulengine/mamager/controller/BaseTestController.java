package com.personal.rulengine.mamager.controller;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration( locations = { 
        "classpath:conf/dispatcher-servlet.xml",
        "classpath:conf/applicationContext.xml",
        "classpath:conf/applicationContext-dubbo-consumer.xml"
})
@WebAppConfiguration
public class BaseTestController {
    
    public final static String CONTENT_TYPE_JSON = "application/json;charset=UTF-8";
    // 定义数据分隔线
    public static final String BOUNDARY = "----MyFormBoundaryForAPPMall20160504"; 
    public final static String CONTENT_TYPE_FILE = "multipart/form-data; boundary="+ BOUNDARY;
    
    public final static String CONTENT_ENCODE = "UTF-8";
    
    @Autowired  
    protected WebApplicationContext webAppContext;  
    
    protected MockMvc mockMvc;  

    @Before
    public void init() throws Exception {
        mockMvc = MockMvcBuilders
                .webAppContextSetup( webAppContext )
                .build(); 
        System.out.println("init...");
    }

    @After
    public void down() throws Exception {
        System.out.println("down...");
    }
    
    @Test
    public void testName() throws Exception {
        System.out.println("testName...");
        Assert.assertTrue(true);
        System.out.println("testName finished...");
    }

}
