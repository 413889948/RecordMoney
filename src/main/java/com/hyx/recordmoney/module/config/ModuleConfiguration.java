package com.hyx.recordmoney.module.config;

import com.hyx.recordmoney.module.ModuleProperties;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ModuleProperties.class)
public class ModuleConfiguration {

    //一些应该相关的bean定义等 autoConfiguration

}
