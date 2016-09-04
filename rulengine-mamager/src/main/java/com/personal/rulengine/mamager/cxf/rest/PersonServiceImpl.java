package com.personal.rulengine.mamager.cxf.rest;

public class PersonServiceImpl implements RestService {

    public Person getPerson(int id, String name) {
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setFrom("泰国");
        person.setGender("不知道");
        return person;
    }

}
