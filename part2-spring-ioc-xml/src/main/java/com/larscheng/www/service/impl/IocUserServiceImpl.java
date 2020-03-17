package com.larscheng.www.service.impl;

import com.larscheng.www.dao.UserDao;
import com.larscheng.www.service.UserService;

/**
 * 描述:
 *
 * @author larscheng
 * @date 2020/3/17 15:14
 */
public class IocUserServiceImpl implements UserService {

    /**
     *
     * 对象创建较给spring 通过spring上下文获取
     * **/
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
