package com.larscheng.www.demostaticproxy;

/***
 * 房产中介：代理角色，对外提供租房业务、带看房、签合同、收中介费....
 */
public class HouseMid implements Rent{

    private Boss boss;

    public HouseMid(Boss boss) {
        this.boss = boss;
    }

    public void rent() {
        see();
        boss.rent();
        sign();
        payFee();
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
