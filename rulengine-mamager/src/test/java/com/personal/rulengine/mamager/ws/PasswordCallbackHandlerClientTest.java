package com.personal.rulengine.mamager.ws;

import javax.annotation.Resource;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.personal.rulengine.mamager.cxf.rest.Person;
import com.personal.rulengine.mamager.cxf.web.DepartmentService;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration( locations = { 
        "classpath:test/applicationContext-cxf-client.xml"
})
public class PasswordCallbackHandlerClientTest {
    
    @Resource(name="departmentServiceWss4j")
    private DepartmentService departmentServiceWss4j;

    @Before
    public void init() throws Exception {
        System.out.println("init...");
    }

    @After
    public void down() throws Exception {
        System.out.println("down...");
    }
    
    @Test
    public void testMain() throws Exception {
        System.out.println("testMain...");
        Person person = departmentServiceWss4j.getPerson(100, "刘保");
        System.out.println(person);
    }
    
}
