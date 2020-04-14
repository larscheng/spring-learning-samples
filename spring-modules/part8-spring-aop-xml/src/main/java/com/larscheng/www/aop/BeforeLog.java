package com.larscheng.www.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
/***
 * 1通过实现spring接口实现apo切面
 */
public class BeforeLog implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName()+"类的方法："+method.getName()+" 开始执行....");
    }
}
