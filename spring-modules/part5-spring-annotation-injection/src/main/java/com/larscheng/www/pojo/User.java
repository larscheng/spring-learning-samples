package com.larscheng.www.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//代替：     <bean id="user" class="com.larscheng.www.pojo.User"/>
@Component
//代替：    <bean id="user" class="com.larscheng.www.pojo.User" scope="singleton"/>
@Scope(value = "singleton")
public class User {
    private String name;

    public String getName() {
        return name;
    }

    //代替：        <property name="name" value="lars"/>
    @Value("lars")
    public void setName(String name) {
        this.name = name;
    }
}
