package com.larscheng.www.dynamicproxy;

import com.larscheng.www.demostaticproxy.HouseMid;

public class Me {
    public static void main(String[] args) {

        DynamicProxyRent proxyRent = new DynamicProxyRent();
        proxyRent.setRent(new Boss());
        Rent proxy = (Rent) proxyRent.getProxy();
        //实际执行invoke
        proxy.rent();

        System.out.println("------------");

        proxyRent.setRent(new Boss2());
        ((Rent) proxyRent.getProxy()).rent();
    }
}
