package com.personal.rulengine.mapper;

import java.util.Map;

import com.personal.rulengine.dao.base.CrudDAO;
import com.personal.rulengine.dao.base.MyBatisRepository;
import com.personal.rulengine.dao.entity.base.TestEntity;

/**
 * 测试信息实体DAO接口
 * 
 * @Author LiuBao
 * @Version 0.1
 * @Comp personal
 * @Date 2016年7月15日下午2:20:08
 * 
 */
@Deprecated
@MyBatisRepository
public interface TestEntityDAO extends CrudDAO<Long, TestEntity> {

    /**
     * 批量插入
     */
    boolean insertList(Map<String, Object> params);

}
