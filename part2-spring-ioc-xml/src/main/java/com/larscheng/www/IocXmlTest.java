package com.larscheng.www;

import com.larscheng.www.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 描述:
 * IOC---xml版测试
 *
 * @author larscheng
 * @date 2020/3/17 15:11
 */
public class IocXmlTest {
    public static void main(String[] args) {

        //ioc容器获取对象  获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //对象都在spring中管理，如果要使用，直接从IOC容器中拿出来
        UserService iocUserService = (UserService) context.getBean("iocUserService");
        UserService iocMysqlUserService = (UserService) context.getBean("iocMysqlUserService");
        UserService iocRedisUserService = (UserService) context.getBean("iocRedisUserService");

        iocUserService.getUser();
        iocMysqlUserService.getUser();
        iocRedisUserService.getUser();



    }
}
