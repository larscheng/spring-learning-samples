package com.larscheng.www;

import com.larscheng.www.impl.AnnotationComponent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConsumerApplication {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        AnnotationComponent consumer = context.getBean("annotationSamplesConsumer", AnnotationComponent.class);
        System.out.println(consumer.doBalalala("123456789"));
    }



}
