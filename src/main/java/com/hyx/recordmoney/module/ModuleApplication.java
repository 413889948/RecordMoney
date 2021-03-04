package com.hyx.recordmoney.module;

import com.sunsharing.share.boot.framework.annotation.EnableFrameWork;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFrameWork
@MapperScan(basePackages = "com.hyx.recordmoney.module.dao.mapper")
public class ModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModuleApplication.class, args);
    }

}
