package com.larscheng.www.realstaticdemo;

import com.larscheng.www.service.impl.UserServiceImpl;
import com.larscheng.www.service.proxy.UserServiceProxy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.add();

        System.out.println("------------------------------");
        //新需求，在不改动原有代码情况下，加入操作日志
        // 引入代理类：单一职责原则：一个类干一个事
        AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(BeansXml.class);
        UserServiceProxy userServiceProxy = con.getBean("userServiceProxy", UserServiceProxy.class);
        userServiceProxy.add();
        userServiceProxy.update();
        userServiceProxy.del();
        userServiceProxy.query();


    }
}


