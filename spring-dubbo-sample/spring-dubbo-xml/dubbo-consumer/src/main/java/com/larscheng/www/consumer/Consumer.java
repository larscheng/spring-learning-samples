package com.larscheng.www.consumer;

import com.larscheng.www.DubboSampleService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) {
        System.setProperty("java.net.preferIPv4Stack", "true");
        System.setProperty("dubbo.application.qos.port", "33333");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        // Obtaining a remote service proxy
        DubboSampleService dubboSampleService = (DubboSampleService)context.getBean("dubboSampleService");
        // Executing remote methods
        String hello = dubboSampleService.sayHi("world");
        // Display the call result
        System.out.println(hello);
    }
}
