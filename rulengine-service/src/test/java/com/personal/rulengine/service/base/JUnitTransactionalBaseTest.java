package com.personal.rulengine.service.base;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
 * 添加继承AbstractTransactionalJUnit4SpringContextTests之后,所有的测试类会自动回滚
 * 
 * @author Liubao
 * @2015年8月6日
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:test/applicationContext.xml",
        "classpath:test/applicationContext-mybatis.xml" ,
        "classpath:test/applicationContext-dataSource.xml",
        "classpath*:test/applicationContext-tx.xml",
         })
public class JUnitTransactionalBaseTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Before
    public void setUp() throws Exception {
        System.out.println("@Before执行了...");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("@After执行了...");
    }

    @Test
    public void test() {
        Assert.assertTrue(true);
    }

}
