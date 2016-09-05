package com.personal.rulengine.mamager.ws;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.personal.rulengine.mamager.cxf.rest.Person;
import com.personal.rulengine.mamager.cxf.web.UserServiceImpl;


/**
 * 调用cxf发布的webservice服务
 * 
 * JaxWsProxyFactoryBean调用服务类可以实现接口,也可以没有接口
 */
public class UserServiceImplClientNoInterface {
    
	public static void main(String[] args) throws Exception {
		//创建 cxf提供的代理工厂bean
		JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
		//设置调用的地址
		jaxWsProxyFactoryBean.setAddress("http://localhost:8080/rulengine-mamager/ws/userService");
		//设置portType
		jaxWsProxyFactoryBean.setServiceClass(UserServiceImpl.class);
		//获取调用portType的实例
		UserServiceImpl userServiceImpl =(UserServiceImpl) jaxWsProxyFactoryBean.create();
		//调用webservice方法
		Person person = userServiceImpl.getPerson(100, "刘保");
		System.out.println(person);
	}
}
