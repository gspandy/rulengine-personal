package com.personal.rulengine.mamager.cxf.web;

import javax.jws.WebService;

import com.personal.rulengine.mamager.cxf.rest.Person;

/**
 * cxf格式的webservice服务
 * 
 * @Author LiuBao
 * @Version 0.1
 * @Comp personal
 * @Date 2016年9月4日下午8:25:36
 * 
 * 可以通过修改targetNamespace,改变命名空间,隐藏包结构信息
 * http://localhost:8080/rulengine-mamager/ws/departmentService?wsdl
 * 
 */
@WebService(serviceName="departmentService",targetNamespace="http://web2.cxf.mamager.rulengine.personal.com/")
public interface DepartmentService {

    public Person getPerson(int id, String name);

}
