package com.personal.rulengine.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import com.alibaba.fastjson.JSON;
import com.personal.rulengine.common.utils.DatetimeUtils;
import com.personal.rulengine.service.TestEntityService;
import com.personal.rulengine.service.base.JUnitTransactionalBaseTest;
import com.personal.rulengine.service.viewobject.TestEntityViewObject;

public class TestEntityServiceImplTest extends JUnitTransactionalBaseTest {

    @Resource
    private TestEntityService testEntityService;
    
    /**
     * 设置自我关联属性,查看toString输出信息
     * "TestEntityViewObject":{"$ref":"@"},表示自我引用
     */
    @Test
    public void testTostring() {
        TestEntityViewObject viewObject = testEntityService.getById(5L);
        Assert.assertNotNull(viewObject);
        //设置自我关联属性.
        viewObject.setMyself(viewObject);
        System.out.println(viewObject.toString());
        System.out.println("init02添加"+JSON.toJSONString(viewObject));
        Assert.assertNotNull(true);
    }

    @Test
    @Rollback(false)
    public void testGetById() {
        TestEntityViewObject viewObject = testEntityService.getById(5L);
        Assert.assertNotNull(viewObject);
        Assert.assertNotNull(true);
    }
    
    @Test
    @Rollback(false)
    public void testSave() {
        TestEntityViewObject viewObject=new TestEntityViewObject();
        viewObject.setRealKey("wife");
        viewObject.setRealValue("wasalili");
        viewObject.setCreateTime(DatetimeUtils.formatTimestamp(DatetimeUtils.currentTimestamp()));
        viewObject.setModifyTime(DatetimeUtils.formatTimestamp(DatetimeUtils.currentTimestamp()));
        boolean result = testEntityService.save(viewObject);
        Assert.assertTrue(result);
    }
    
    @Test
    @Rollback(false)
    public void testSaveList() {
        List<TestEntityViewObject> viewObjects=new  ArrayList<>();
        for (int i = 0; i < 5; i++) {
            TestEntityViewObject viewObject=new TestEntityViewObject();
            viewObject.setRealKey("wife"+i);
            viewObject.setRealValue("wasalili"+i);
            viewObject.setCreateTime(DatetimeUtils.formatTimestamp(DatetimeUtils.currentTimestamp()));
            viewObject.setModifyTime(DatetimeUtils.formatTimestamp(DatetimeUtils.currentTimestamp()));
            viewObjects.add(viewObject);
        }
        testEntityService.save(viewObjects);
        Assert.assertTrue(true);
    }

}
