package com.personal.rulengine.mamager.cxf.web;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

import com.personal.rulengine.mamager.cxf.rest.Person;

/**
 * 无接口方式
 * 
 * @Author LiuBao
 * @Version 0.1
 * @Comp personal
 * @Date 2016年9月4日下午8:27:31
 *
 *可以通过修改targetNamespace,改变命名空间,隐藏包结构信息
 *http://localhost:8080/rulengine-mamager/ws/userService?wsdl
 *
 *@BindingType 指定是soap1.1还是soap1.2协议
 *@WebMethod  true:不暴露对应的方法
 *
 */
@WebService(serviceName="userService",targetNamespace="http://web3.cxf.mamager.rulengine.personal.com/")
@BindingType(value=SOAPBinding.SOAP12HTTP_BINDING)
public class UserServiceImpl {
	
    public Person getPerson(int id, String name) {
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setFrom("中国");
        person.setGender("男");
        return person;
    }
    
    @WebMethod(exclude=false,operationName="getPersonIgnore1",action="/getPersonIgnore2")
    public Person getPersonIgnore(int id, String name) {
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setFrom("中国");
        person.setGender("男");
        return person;
    }
    
    
    
}
