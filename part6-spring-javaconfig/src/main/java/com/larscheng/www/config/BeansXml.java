package com.larscheng.www.config;

import com.larscheng.www.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/***
 * 等价  beans.xml
 */

//等价<beans >.............</beans>
@Configuration
//等价<context:component-scan>
@ComponentScan(value = "com.larscheng")
//等价<import />
@Import(BeanConfig.class)
public class BeansXml {

    //等价 <bean />  方法名为id
    @Bean
    public User user(){
        return new User();
    }
}
