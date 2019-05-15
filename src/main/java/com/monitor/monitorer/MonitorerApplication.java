package com.monitor.monitorer;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.monitor.monitorer.mapper")
public class MonitorerApplication {

	static Log log = LogFactory.get();

	public static void main(String[] args) {

		log.info("开始");
		SpringApplication.run(MonitorerApplication.class, args);
	}

}
