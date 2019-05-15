package com.monitor.monitorer.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.monitor.monitorer.entity.Test;
import com.monitor.monitorer.mapper.TestMapper;
import com.monitor.monitorer.service.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author duzj
 * @since 2019-05-15
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public IPage<Test> selectUserPage(Page<Test> page, Integer age) {
        return testMapper.mySelectPage(page,age);
    }
}
