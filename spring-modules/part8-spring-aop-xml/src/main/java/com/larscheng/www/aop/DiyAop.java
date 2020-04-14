package com.larscheng.www.aop;

/***
 * 2、自定义apo切面类
 */
public class DiyAop {
    public void before (){
        System.out.println("log---> 方法执行前......");
    }

    public void after (){
        System.out.println("log---> 方法执行后......");
    }
}
