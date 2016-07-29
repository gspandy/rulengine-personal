package com.personal.rulengine.dao.base;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.testng.Assert;

/**
 * 基础环境加载类
 * 
 * @Author LiuBao
 * @Version 0.1
 * @Comp personal
 * @Date 2016年7月15日下午2:27:05
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { 
        "classpath:test/applicationContext.xml",
        "classpath:test/applicationContext-mybatis.xml" ,
        "classpath:test/applicationContext-dataSource.xml"
        })
public class BaseDAOTest {
    
    @Test
    public void testName() throws Exception {
        Assert.assertTrue(true);
    }
    
    @Before
    public void testBefore() throws Exception {
        System.out.println("@Before执行了...");
    }
    
    @After
    public void testAfter() throws Exception {
        System.out.println("@After执行了...");
    }
    
}
