package com.larscheng.www;

import com.larscheng.www.pojo.AutowiredPerson;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: larscheng
 * @date: 2020/4/3 下午5:49
 * @description: autowired自动注入bean测试
 */
public class AutowiredPersonTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("annotation-beans.xml");

        System.out.println(con.getBean("liming", AutowiredPerson.class).toString());
    }
}
