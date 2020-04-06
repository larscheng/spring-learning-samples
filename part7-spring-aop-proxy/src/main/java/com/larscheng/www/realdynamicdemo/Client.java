package com.larscheng.www.realdynamicdemo;

import com.larscheng.www.realdynamicdemo.service.UserService;
import com.larscheng.www.realdynamicdemo.service.impl.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.add();

        System.out.println("--------------加入动态代理----------------");
        //新需求，在不改动原有代码情况下，加入操作日志
        // 引入代理类：单一职责原则：一个类干一个事

        DynamicProxy dynamicProxy = new DynamicProxy();
        dynamicProxy.setTarget(userService);
        UserService proxy = (UserService) dynamicProxy.getProxy();
        proxy.add();
        proxy.del();
        proxy.query();
        proxy.update();


    }
}


