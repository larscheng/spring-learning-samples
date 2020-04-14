package com.larscheng.www.dynamicproxy;

/***
 * 房东 真实角色，真正提供房子的人
 */
public class Boss2 implements Rent {
    public void rent() {
        System.out.println("房东2：我有4室1厅的房子要出租");
    }
}
