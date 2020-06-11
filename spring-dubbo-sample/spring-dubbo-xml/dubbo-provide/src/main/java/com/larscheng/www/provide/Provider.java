package com.larscheng.www.provide;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Provider {
    public static void main(String[] args) throws IOException {
        System.setProperty("java.net.preferIPv4Stack", "true");
        System.setProperty("dubbo.application.qos.port", "22222");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provide.xml");
        context.start();
        System.out.println("Provider started.");
        System.in.read(); // press any key to exit
    }
}
