package com.larscheng.www;

import com.larscheng.www.pojo.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: larscheng
 * @date: 2020/4/3 下午2:55
 * @description: xml自动注入bean测试
 */
public class XmlInjectionTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        System.out.println(context.getBean("liming", Person.class).toString());
        System.out.println(context.getBean("lihua", Person.class).toString());

    }
}
