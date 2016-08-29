package com.personal.rulengine.mamager.controller.order;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 测试子实体信息
 * 
 * @Author LiuBao
 * @Version 0.1
 * @Comp personal
 * @Date 2016年8月29日下午11:15:56
 * 
 */
@XmlRootElement(name = "myBirth")
public class Birth implements Cloneable{
    
    private String country;

    public Birth() {
    }

    public Birth(String country) {
        this.country = country;
    }

    @XmlElement(name = "myCountry")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this,
                ToStringStyle.SHORT_PREFIX_STYLE);
    }
}