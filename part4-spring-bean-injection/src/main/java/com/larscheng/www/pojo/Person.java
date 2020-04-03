package com.larscheng.www.pojo;

/**
 * @author: larscheng
 * @date: 2020/4/3 下午3:13
 * @description: test
 */
public class Person {
    private String name;
    private Son son;
    private Daughter daughter;


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", son=" + son +
                ", daughter=" + daughter +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Son getSon() {
        return son;
    }

    public void setSon(Son son) {
        this.son = son;
    }

    public Daughter getDaughter() {
        return daughter;
    }

    public void setDaughter(Daughter daughter) {
        this.daughter = daughter;
    }
}
