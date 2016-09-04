package com.personal.rulengine.mamager.cxf.web;

import javax.jws.WebService;

import com.personal.rulengine.mamager.cxf.rest.Person;

/**
 * 无接口方式
 * 
 * @Author LiuBao
 * @Version 0.1
 * @Comp personal
 * @Date 2016年9月4日下午8:27:31
 *
 */
@WebService
public class UserServiceImpl {
	
    public Person getPerson(int id, String name) {
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setFrom("中国");
        person.setGender("男");
        return person;
    }
}
