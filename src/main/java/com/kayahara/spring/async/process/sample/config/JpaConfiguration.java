package com.kayahara.spring.async.process.sample.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"com.kayahara.spring.async.process.sample.repository"})
@EntityScan(basePackages = {"com.kayahara.spring.async.process.sample.entity"})
public class JpaConfiguration {
}
