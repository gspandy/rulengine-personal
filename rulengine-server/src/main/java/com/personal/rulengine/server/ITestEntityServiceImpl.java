package com.personal.rulengine.server;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.personal.rulengine.server.api.ITestEntityService;
import com.personal.rulengine.service.TestEntityService;

/**
 * rpc服务层接口定义实现:业务层封装
 * 
 * @Author LiuBao
 * @Version 0.1
 * @Comp personal
 * @Date 2016年7月21日下午11:44:52
 * 
 */
@Service("test.ITestEntityService")
public class ITestEntityServiceImpl implements ITestEntityService {

    @SuppressWarnings("unused")
    private static final Logger logger = LoggerFactory.getLogger(ITestEntityServiceImpl.class);

    @Resource
    private TestEntityService testEntityService;

    @Override
    public long getTotalCount() {
        return testEntityService.getAllCount(true);
    }


}
