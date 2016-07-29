package com.personal.rulengine.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.rulengine.dao.TestEntityDAO2;
import com.personal.rulengine.dao.entity.base.TestEntity;
import com.personal.rulengine.service.TestEntityService;
import com.personal.rulengine.service.base.GenericServiceImpl;
import com.personal.rulengine.service.viewobject.TestEntityViewObject;

@Service
public class TestEntityServiceImpl extends
        GenericServiceImpl<TestEntityViewObject, TestEntity, TestEntityServiceImpl>
        implements TestEntityService {

    @SuppressWarnings("unused")
    private static final Logger logger = LoggerFactory.getLogger(TestEntityServiceImpl.class);

    @Resource
    private TestEntityDAO2 testEntityDAO2;

    public TestEntityServiceImpl() {
        super();
    }

    @Autowired
    public TestEntityServiceImpl(TestEntityDAO2 testEntityDAO2) {
        super(testEntityDAO2);
        this.testEntityDAO2 = testEntityDAO2;
    }

}
