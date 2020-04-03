package com.larscheng.www;

import com.larscheng.www.pojo.School;
import com.larscheng.www.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: larscheng
 * @date: 2020/4/2 下午4:58
 * @description: 依赖注入测试类
 */
public class SpringDiTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student zhangsan = context.getBean("zhangsan", Student.class);
        System.out.println(zhangsan.toString());

        context = new ClassPathXmlApplicationContext("pc-beans.xml");

        School school1 = context.getBean("school1", School.class);
        School school2 = context.getBean("school2", School.class);

        System.out.println(school1.toString());
        System.out.println(school2.toString());
    }
}
