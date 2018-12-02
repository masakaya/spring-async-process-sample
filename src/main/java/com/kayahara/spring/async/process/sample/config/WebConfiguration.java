package com.kayahara.spring.async.process.sample.config;

import com.kayahara.spring.async.process.common.WebCommonConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(WebCommonConfiguration.class)
@ComponentScan(basePackages = {
    "com.kayahara.spring.async.process.sample.repository",
    "com.kayahara.spring.async.process.sample.service",
    "com.kayahara.spring.async.process.sample.controller",
})
public class WebConfiguration {
}
