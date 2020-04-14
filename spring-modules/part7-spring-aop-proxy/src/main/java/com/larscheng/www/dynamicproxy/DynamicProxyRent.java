package com.larscheng.www.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyRent implements InvocationHandler {
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    /**
     * 自动创建代理类
     * @return
     */
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
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
        see();
        Object result = method.invoke(rent, args);
        sign();
        payFee();
        return result;
    }

    private void see(){
        System.out.println("中介：去看房");
    }

    private void sign(){
        System.out.println("中介：签合同");
    }

    private void payFee(){
        System.out.println("中介：收取中介费");
    }
}
