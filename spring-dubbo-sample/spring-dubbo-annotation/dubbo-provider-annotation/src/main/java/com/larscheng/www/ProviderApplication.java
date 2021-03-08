package com.larscheng.www;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class ProviderApplication {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();
        System.out.println("Provider started......");
        System.in.read();
    }
}
