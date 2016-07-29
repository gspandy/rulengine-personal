package com.personal.rulengine.service;

import com.personal.rulengine.dao.entity.base.TestEntity;
import com.personal.rulengine.service.base.GenericService;
import com.personal.rulengine.service.viewobject.TestEntityViewObject;

public interface TestEntityService extends
        GenericService<TestEntityViewObject, TestEntity> {

}
