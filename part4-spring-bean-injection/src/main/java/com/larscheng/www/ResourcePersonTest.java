package com.larscheng.www;

import com.larscheng.www.pojo.AutowiredPerson;
import com.larscheng.www.pojo.ResourcePerson;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: larscheng
 * @date: 2020/4/3 下午5:49
 * @description: Resource自动注入bean测试
 */
public class ResourcePersonTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("annotation-beans.xml");

        System.out.println(con.getBean("liming2", ResourcePerson.class).toString());
    }
}
