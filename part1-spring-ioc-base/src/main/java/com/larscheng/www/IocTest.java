package com.larscheng.www;

import com.larscheng.www.dao.impl.UserDaoImpl;
import com.larscheng.www.dao.impl.UserDaoMysqlImpl;
import com.larscheng.www.dao.impl.UserDaoRedisImpl;
import com.larscheng.www.service.UserService;
import com.larscheng.www.service.impl.IocUserServiceImpl;
import com.larscheng.www.service.impl.NormalUserServiceImpl;

/**
 * 描述:
 * IOC思想版测试
 *
 * @author larscheng
 * @date 2020/3/17 15:11
 */
public class IocTest {
    public static void main(String[] args) {
        IocUserServiceImpl userService = new IocUserServiceImpl();
        //调用方指定要调用的实现类，将对象的创建控制权交由调用方

        userService.setUserDao(new UserDaoMysqlImpl());
        userService.getUser();
        userService.setUserDao(new UserDaoRedisImpl());
        userService.getUser();
        userService.setUserDao(new UserDaoImpl());
        userService.getUser();


    }
}
