package com.larscheng.www;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableDubbo(scanBasePackages = "com.larscheng.www")
@PropertySource("classpath:/consumer.properties")
@ComponentScan(value = {"com.larscheng.www"})
public class ConsumerConfiguration {
}
