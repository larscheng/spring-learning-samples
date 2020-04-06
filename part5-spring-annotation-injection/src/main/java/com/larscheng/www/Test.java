package com.larscheng.www;

import com.larscheng.www.pojo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println(con.getBean("user", User.class).getName());
    }
}
