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
     * 此处通过set方法来引入dao层实现
     * 如果要切换到mysql、redis、其他实现，只需要set传入不同的类即可，控制权交给调用方
     * **/
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
