package com.larscheng.www;

import com.larscheng.www.pojo.Demo1;
import com.larscheng.www.pojo.Demo2;
import com.larscheng.www.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 描述:
 * IOC---创建对象测试
 *
 * @author larscheng
 * @date 2020/3/17 15:11
 */
public class IocXmlCreateObjTest {
    public static void main(String[] args) {

        //ioc容器获取对象  获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //对象都在spring中管理，如果要使用，直接从IOC容器中拿出来
        Demo1 demo1 = (Demo1) context.getBean("demo1");
        Demo2 demo2 = (Demo2) context.getBean("demo2");
        Demo2 demo3 = (Demo2) context.getBean("demo3");
        Demo2 demo4 = (Demo2) context.getBean("demo4");

        System.out.println("无参构造-set："+demo1.toString());
        System.out.println("有参构造-下标："+demo2.toString());
        System.out.println("有参构造-类型："+demo3.toString());
        System.out.println("有参构造-名称："+demo4.toString());

    }
}
