package com.personal.rulengine.service.viewobject;

import com.personal.rulengine.common.viewobject.BaseViewObject;

/**
 * TestEntity返回vo
 */
public class TestEntityViewObject extends BaseViewObject<TestEntityViewObject> {

    private static final long serialVersionUID = 2008584433057353890L;

    private String realKey;
    private String realValue;
    private TestEntityViewObject myself;
    
    public TestEntityViewObject getMyself() {
        return myself;
    }

    public void setMyself(TestEntityViewObject myself) {
        this.myself = myself;
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
