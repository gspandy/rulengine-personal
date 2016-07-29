package com.personal.rulengine.dao.impl;

import org.springframework.stereotype.Repository;

import com.personal.rulengine.dao.TestEntityDAO2;
import com.personal.rulengine.dao.base.GenericDAOBatisImpl;
import com.personal.rulengine.dao.entity.base.TestEntity;

@Repository
public class TestEntityDAOImpl extends
        GenericDAOBatisImpl<TestEntity, TestEntityDAOImpl> implements
        TestEntityDAO2 {

}
