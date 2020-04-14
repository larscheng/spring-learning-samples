package com.larscheng.www.service.impl;

import com.larscheng.www.dao.UserDao;
import com.larscheng.www.dao.impl.UserDaoImpl;
import com.larscheng.www.service.UserService;

/**
 * 描述:
 *
 * @author larscheng
 * @date 2020/3/17 15:14
 */
public class NormalUserServiceImpl implements UserService {

    /**
     * 此处通过new来引入dao层实现，由程序员写死
     * 如果要切换到mysql、redis、其他实现，需要修改代码
     * **/
    private UserDao userDao = new UserDaoImpl();
//    private UserDao userDao = new UserDaoMysqlImpl();
//    private UserDao userDao = new UserDaoRedisImpl()


    public void getUser() {
        userDao.getUser();
    }
}
