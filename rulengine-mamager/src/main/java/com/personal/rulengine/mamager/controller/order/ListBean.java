package com.personal.rulengine.mamager.controller.order;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 无法解析该实体信息
 * 
 * @Author LiuBao
 * @Version 0.1
 * @Comp personal
 * @Date 2016年8月29日下午11:58:59
 *
 */
@XmlRootElement
public class ListBean {
    
    private String name;
    private List<Birth> list;
    
    public ListBean(String name, List<Birth> list) {
        super();
        this.name = name;
        this.list = list;
    }

    @XmlElements({ @XmlElement(name = "birth", type = Birth.class),
            @XmlElement(name = "account", type = AccountBean.class), })
    public List<Birth> getList() {
        return list;
    }

    public void setList(List<Birth> list) {
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this,
                ToStringStyle.SHORT_PREFIX_STYLE);
    }
}