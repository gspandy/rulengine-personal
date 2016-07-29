package com.personal.rulengine.dao.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

import com.personal.rulengine.common.utils.DatetimeUtils;
import com.personal.rulengine.dao.TestEntityDAO2;
import com.personal.rulengine.dao.base.BaseDAOTest;
import com.personal.rulengine.dao.entity.base.TestEntity;

/**
 * testEntityDAO2测试类
 * 
 * @Author LiuBao
 * @Version 0.1
 * @Comp personal
 * @Date 2016年7月15日下午2:32:23
 * 
 */
public class TestEntityDAO2Test extends BaseDAOTest {

    @Autowired
    private TestEntityDAO2 testEntityDAO2;

    @Test
    public void testInsert() throws Exception {
        String value = "userName";
        String key = "liubao";
        TestEntity entity = new TestEntity(key, value);
        entity.setCode(DatetimeUtils.currentTimestampStr());
        int insert = testEntityDAO2.insert(entity);
        Assert.assertEquals(insert, 1);
        Assert.assertNotNull(entity.getId());
    }

    @Test
    public void testGetOne() throws Exception {
        Long id =4L;
        TestEntity entity = testEntityDAO2.findById(id);
        Assert.assertNotNull(entity);
        Assert.assertEquals(4L, entity.getId().longValue());
    }

    @Test
    public void testUpdate() throws Exception {
        Long id = 4L;
        TestEntity entity = testEntityDAO2.findById(id);
        Assert.assertNotNull(entity);
        Assert.assertEquals(4L, entity.getId().longValue());
        entity.setDeleted(true);
        entity.setDescription("我的描述信息...");
        int update = testEntityDAO2.update(entity);
        Assert.assertEquals(update, 1);

    }

    @Test
    public void testDelete() {
        Long id = 2L;
        int delete = testEntityDAO2.deleteById(id);
        Assert.assertEquals(delete,1L);
    }

    @Test
    public void testGetAll() {
        Map<String, Object> params=new HashMap<>();
        params.put("id", "4");
        List<TestEntity> list = testEntityDAO2.selectByPageQuery(params);
        Assert.assertNotNull(list);
    }

    @Test
    public void testBatchInsert() throws Exception {
        final int NUM = 5;
        List<TestEntity> list=new ArrayList<>(NUM);
        String value = "userName";
        String key = "liubao";
        for (int i = 0; i < NUM; i++) {
            TestEntity entity = new TestEntity(key+i, value+i);
            entity.setCode(DatetimeUtils.currentTimestampStr()+i);
            list.add(entity);
        }
        
        testEntityDAO2.insert(list);
        Assert.assertTrue(true);
    }

}
