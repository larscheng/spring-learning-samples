package com.larscheng.www.realstaticdemo;

import com.larscheng.www.service.UserService;
import com.larscheng.www.service.impl.UserServiceImpl;
import com.larscheng.www.service.proxy.UserServiceProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.larscheng")
public class BeansXml {

    @Bean
    public UserService userService(){
        return new UserServiceImpl();
    }

    @Bean
    public UserService userServiceProxy(){
        return new UserServiceProxy();
    }
}
