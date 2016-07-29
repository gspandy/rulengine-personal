package com.personal.rulengine.dao.entity.base;

import org.apache.ibatis.type.Alias;

import com.personal.rulengine.common.entity.BaseEntity;

/**
 * 测试实体
 * 
 * @Author LiuBao
 * @Version 0.1
 * @Comp personal
 * @Date 2016年7月15日下午2:05:17
 * 
 */
@Alias(value = "testEntity")
public class TestEntity extends BaseEntity {

    private static final long serialVersionUID = -3669875901244450983L;

    private String realKey;
    private String realValue;
    
    public TestEntity() {
        super();
    }

    public TestEntity(String realKey, String realValue) {
        super();
        this.realKey = realKey;
        this.realValue = realValue;
    }

    public String getRealKey() {
        return realKey;
    }

    public void setRealKey(String realKey) {
        this.realKey = realKey;
    }

    public String getRealValue() {
        return realValue;
    }

    public void setRealValue(String realValue) {
        this.realValue = realValue;
    }

}
