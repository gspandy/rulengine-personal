package com.personal.rulengine.mamager.cxf.web;

import com.personal.rulengine.mamager.cxf.rest.Person;

public class DepartmentServiceImpl implements DepartmentService {

    public Person getPerson(int id, String name) {
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setFrom("美国");
        person.setGender("女");
        return person;
    }

}
