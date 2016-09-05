package com.personal.rulengine.mamager.ws;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.personal.rulengine.mamager.cxf.rest.Person;
import com.personal.rulengine.mamager.cxf.web.UserServiceImpl;

/**
 * 无加密拦截器服务调用:目标服务必须实现接口类
 * 
 * @Author LiuBao
 * @Version 0.1
 * @Comp personal
 * @Date 2016年9月5日下午1:21:33
 *
 */
public class UserServiceImplClientNoWss4j {
    
	private static ApplicationContext applicationContext;

    public static void main(String[] args) throws Exception{
		applicationContext = new ClassPathXmlApplicationContext("classpath:test/applicationContext-cxf-client.xml");
		
		//从spring环境获取客户端bean
		UserServiceImpl userService =  (UserServiceImpl)applicationContext.getBean("userService");
		//调用webservice方法
        Person person = userService.getPerson(100, "刘保");
        System.out.println(person);
	}
}
