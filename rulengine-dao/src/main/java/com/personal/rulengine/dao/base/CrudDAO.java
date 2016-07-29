package com.personal.rulengine.dao.base;

import java.util.List;
import java.util.Map;

/**
 * 基础的增删改查接口类
 * 
 * @Author LiuBao
 * @Version 0.1
 * @Comp personal
 * @Date 2016年7月15日下午1:55:28
 * 
 */
public interface CrudDAO<PK, T> {

    int insert(T entity);

    int update(T entity);

    int delete(PK id);

    T findOne(PK id);

    List<T> findAll(Map<String, Object> params);

}