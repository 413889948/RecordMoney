package com.hyx.recordmoney.module;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@ConfigurationProperties(prefix = "module")
@Data
public class ModuleProperties {

    //定义各种属性
    //private String prop = "prop";

}
