package com.larscheng.www.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/***
 * 1通过实现spring接口实现apo切面
 */
public class AfterLog implements AfterReturningAdvice {
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "类的方法：" + method.getName() + " 执行结束，返回结果：" + returnValue);

    }
}
