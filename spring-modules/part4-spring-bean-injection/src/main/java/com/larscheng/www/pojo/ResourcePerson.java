package com.larscheng.www.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * @author: larscheng
 * @date: 2020/4/3 下午5:46
 * @description: Autowired注解装配bean
 */
public class ResourcePerson {

    private String name;

    @Resource(name = "son")
    private Son son;
    @Resource(name = "daughter2")
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
