package com.larscheng.www.config;

import com.larscheng.www.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.larscheng.*")
public class BeanConfig {
    @Bean
    public Person person(){
        return new Person();
    }
}
