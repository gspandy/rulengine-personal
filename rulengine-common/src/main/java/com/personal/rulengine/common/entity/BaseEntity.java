package com.personal.rulengine.common.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.personal.rulengine.common.utils.DatetimeUtils;

/**
 * 基础信息实体类
 * 
 * @Author LiuBao
 * @Version 0.1
 * @Comp personal
 * @Date 2016年7月15日下午2:01:01
 * 
 */
public abstract class BaseEntity implements Cloneable, Serializable {

    private static final long serialVersionUID = -4018719948977780428L;
    protected Long id;
    protected String code;
    protected String description;
    protected boolean deleted;
    protected Timestamp createTime;
    protected Timestamp modifyTime;

    /**
     * 设置默认时间参数信息
     */
    public BaseEntity() {
        super();
        this.setCreateTime(DatetimeUtils.currentTimestamp());
        this.setModifyTime(DatetimeUtils.currentTimestamp());
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this,
                ToStringStyle.SHORT_PREFIX_STYLE);
    }

}