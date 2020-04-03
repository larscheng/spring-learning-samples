package com.larscheng.www.pojo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author: larscheng
 * @date: 2020/4/3 下午5:46
 * @description: 注解装配bean
 */
public class AutowiredPerson {

    private String name;

    @Autowired
    private Son son;
    @Autowired
    private Daughter daughter;

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

    @Override
    public String toString() {
        return "AutowiredPerson{" +
                "name='" + name + '\'' +
                ", son=" + son +
                ", daughter=" + daughter +
                '}';
    }
}
