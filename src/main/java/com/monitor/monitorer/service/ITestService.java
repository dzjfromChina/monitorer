package com.monitor.monitorer.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.monitor.monitorer.entity.Test;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author duzj
 * @since 2019-05-15
 */
public interface ITestService extends IService<Test> {
    /**
     * 分页 demo
     * @param page
     * @param age
     * @return
     */
    public IPage<Test> selectUserPage(Page<Test> page, Integer age);
}
