package com.larscheng.www.dao.impl;

import com.larscheng.www.dao.UserDao;

/**
 * 描述:
 *
 * @author larscheng
 * @date 2020/3/17 15:14
 */
public class UserDaoMysqlImpl implements UserDao {
    public void getUser() {
        System.out.println("从Mysql获取到用户信息");
    }
}
