package com.kayahara.spring.async.process.common;

import com.kayahara.spring.async.process.common.configuration.JacksonConfiguration;
import com.kayahara.spring.async.process.common.configuration.SwaggerConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages= {"com.kayahara.spring.async.process.common"})
@Import(value = { SwaggerConfiguration.class , JacksonConfiguration.class })
public class WebCommonConfiguration {

}
