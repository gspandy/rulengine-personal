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
 */
@WebService
public interface DepartmentService {

    public Person getPerson(int id, String name);

}
