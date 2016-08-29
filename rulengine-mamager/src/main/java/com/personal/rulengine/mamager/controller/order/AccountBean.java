package com.personal.rulengine.mamager.controller.order;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 返回xml数据实体测试VO
 * 
 * @XmlElement只能标注在get方法上面!!!
 * 
 * @Author LiuBao
 * @Version 0.1
 * @Comp personal
 * @Date 2016年8月29日下午11:13:39
 * 
 */
@XmlRootElement(name = "account")
public class AccountBean {
    private int id;
    private String name;
    private String email;
    private Birth brith;

    @XmlElement
    public Birth getBrith() {
        return brith;
    }

    public void setBrith(Birth brith) {
        this.brith = brith;
    }

    @XmlElement
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // @XmlElement
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this,
                ToStringStyle.SHORT_PREFIX_STYLE);
    }

}