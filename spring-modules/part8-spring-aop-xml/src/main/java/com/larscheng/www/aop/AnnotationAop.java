package com.larscheng.www.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/***
 * 3、通过注解实现aop切面
 */
@Aspect
public class AnnotationAop {
    @Before("execution(* com.larscheng.www.impl.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("--------------before");
    }


    @After("execution(* com.larscheng.www.impl.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("--------------after");
    }


    @Around("execution(* com.larscheng.www.impl.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("--------------环绕开始");

        System.out.println("ProceedingJoinPoint: "+point.getSignature().getName());
        //执行调用
        point.proceed();

        System.out.println("--------------环绕结束");
    }
}
