package com.larscheng.www.pojo;

/**
 * @author: larscheng
 * @date: 2020/4/3 下午3:17
 * @description:
 */
public class Son {
    private String name;

    @Override
    public String toString() {
        return "Son{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
