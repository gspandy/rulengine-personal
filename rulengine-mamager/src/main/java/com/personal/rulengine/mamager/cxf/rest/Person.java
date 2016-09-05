package com.personal.rulengine.mamager.cxf.rest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 被发布的类转换成的格式的根元素....
 * 
 * @Author LiuBao
 * @Version 0.1
 * @Comp personal
 * @Date 2016年9月4日下午5:25:20
 * 
 */
@XmlRootElement(name = "Student")
public class Person {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    private int id;
    private String name;
    private String gender;
    private String from;

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", gender=" + gender
                + ", from=" + from + "]";
    }

}
