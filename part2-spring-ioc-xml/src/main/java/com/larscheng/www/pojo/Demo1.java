package com.larscheng.www.pojo;

/**
 * @author: larscheng
 * @date: 2020/4/2 下午4:09
 * @description: 无参构造测试对象
 */
public class Demo1 {
    private String name;

    private int age;

    public Demo1() {
        System.out.println("ioc容器加载bean调用无参构造....");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Demo1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
