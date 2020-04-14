package com.larscheng.www;

import com.larscheng.www.config.BeansXml;
import com.larscheng.www.pojo.Person;
import com.larscheng.www.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.Resource;

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeansXml.class);
        System.out.println(context.getBean("user", User.class).toString());
        System.out.println(context.getBean("person", Person.class).toString());


    }
}
