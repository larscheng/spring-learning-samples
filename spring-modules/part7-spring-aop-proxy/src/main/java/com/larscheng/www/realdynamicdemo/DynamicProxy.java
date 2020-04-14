package com.larscheng.www.realdynamicdemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    /**
     * 自动创建代理类
     * @return
     */
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    /***
     * 通过自动创建的代理类执行 真实对象的方法
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        return method.invoke(target, args);
    }

    private void log(String msg){
        System.out.println("log ---> "+msg);
    }

}
