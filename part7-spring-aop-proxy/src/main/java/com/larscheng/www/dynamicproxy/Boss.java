package com.larscheng.www.dynamicproxy;

/***
 * 房东 真实角色，真正提供房子的人
 */
public class Boss implements Rent {
    public void rent() {
        System.out.println("房东：我有3室1厅的房子要出租");
    }
}
