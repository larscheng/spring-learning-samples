package com.larscheng.www.demostaticproxy;

public class Me {
    public static void main(String[] args) {
        HouseMid houseMid = new HouseMid(new Boss());
        houseMid.rent();
    }
}
