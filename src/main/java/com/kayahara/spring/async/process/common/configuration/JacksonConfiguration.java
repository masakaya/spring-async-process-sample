package com.kayahara.spring.async.process.common.configuration;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

/**
 * JSON Config.
 *
 * @author masashi.kayahara
 */
@Configuration
public class JacksonConfiguration {
  @Bean
  public Jackson2ObjectMapperBuilder jackson2ObjectMapperBuilder() {
    return new Jackson2ObjectMapperBuilder()
        .propertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
  }
}
