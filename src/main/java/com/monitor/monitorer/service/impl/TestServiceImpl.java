package com.monitor.monitorer.service.impl;

import com.monitor.monitorer.entity.Test;
import com.monitor.monitorer.mapper.TestMapper;
import com.monitor.monitorer.service.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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

}
