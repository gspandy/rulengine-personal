package com.personal.rulengine.mamager.ws;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.personal.rulengine.mamager.cxf.rest.Person;
import com.personal.rulengine.mamager.cxf.web.DepartmentService;

/**
 * 手动添加加密拦截器
 * 
 * @Author LiuBao
 * @Version 0.1
 * @Comp personal
 * @Date 2016年9月5日下午1:21:17
 *
 */
public class DepartmentServiceClientWss4j {
    
	public static void main(String[] args) {
	    ApplicationContext applicationContext = null;
		try {
		    //通过配置文件加载spring环境
            applicationContext = new ClassPathXmlApplicationContext("classpath:test/applicationContext-cxf-client.xml");
            
            //从spring环境获取客户端bean
            DepartmentService departmentServiceWss4j =  (DepartmentService)applicationContext.getBean("departmentServiceWss4j");
            //调用webservice方法
            Person person = departmentServiceWss4j.getPerson(100, "刘保");
            System.out.println(person);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            applicationContext=null;
        }
	}
}
