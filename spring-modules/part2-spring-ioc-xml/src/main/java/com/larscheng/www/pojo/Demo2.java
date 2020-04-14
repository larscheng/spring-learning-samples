package com.larscheng.www.pojo;

/**
 * @author: larscheng
 * @date: 2020/4/2 下午4:09
 * @description: 有参构造测试对象
 */
public class Demo2 {
    private String name;

    private int age;

    public Demo2(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("ioc容器加载bean调用有参构造....");
    }

    public Demo2() {
        System.out.println("");
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
        return "Demo2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
