package com.personal.rulengine.common.viewobject;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 视图类基类
 */
public class BaseViewObject<V extends BaseViewObject<V>> implements Cloneable,Serializable {
// public class BaseViewObject implements Cloneable,Serializable {

    private static final long serialVersionUID = 8950660914544659827L;

    private Class<V> viewObjectClass;

    private Long id;
    private String code;
    private String description;        // 描述
    private String deleted ;            // 记录是否已被删除（默认为false）
    private String createTime;       // 记录创建日期
    private String modifyTime;      // 记录最近修改日期

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Class<V> getViewObjectClass() {
        return viewObjectClass;
    }

    public void setViewObjectClass(Class<V> viewObjectClass) {
        this.viewObjectClass = viewObjectClass;
    }

    @SuppressWarnings("unchecked")
    public BaseViewObject() {
        Type type = this.getClass().getGenericSuperclass();
        if (type != null && type instanceof ParameterizedType) {
            viewObjectClass = (Class<V>) ((ParameterizedType) type)
                    .getActualTypeArguments()[0];
        } else {
            throw new IllegalArgumentException("Type argument <V> is empty!!");
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object object) {
        boolean b = false;
        if (object == null) {
            b = false;
        } else if (object == this) {
            b = true;
        } else if (object.getClass() == this.viewObjectClass) {
            b = equals((V) object);
        }
        return b;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this,
                ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
