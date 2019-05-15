package com.monitor.monitorer.controller;


import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.monitor.monitorer.entity.Test;
import com.monitor.monitorer.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author duzj
 * @since 2019-05-15
 */
@RestController
@RequestMapping("/monitorer/test")
public class TestController {

    static Log log = LogFactory.get();

    @Autowired
    private ITestService iTestService;


    @PostMapping(value = "/test")
    public Object test(@RequestBody String jsonString) {
        log.info("start");
        int count = iTestService.count();
        List<Test> list = iTestService.list();
        Test byId = iTestService.getById(1);
        log.info(list.get(0).getName());

        log.info("end");
        return list.get(0);
    }
}
