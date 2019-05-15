package com.monitor.monitorer.controller;





import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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


        String s = JSONUtil.formatJsonStr(jsonString);
        System.out.println(s);
        JSON parse = JSONUtil.parse(jsonString);
        Integer pageNo = Integer.parseInt(parse.getByPath("pageNo").toString());
        Integer pageSize = Integer.parseInt(parse.getByPath("pageSize").toString());
        //总个数
        int count = iTestService.count();


        Page page = new Page();
        //每页显示
        page.setSize(pageSize);
        //总公共数量
        page.setTotal(count);
        //要显示第几页
        page.setCurrent(pageNo);
        IPage<Test> iPage = iTestService.selectUserPage(page, 18);
        List<Test> records = iPage.getRecords();


        List<Test> list = iTestService.list();
        Test byId = iTestService.getById(1);
        log.info(list.get(0).getName());
        log.info("end");


        return JSONUtil.parse(records).toJSONString(0);
    }
}
