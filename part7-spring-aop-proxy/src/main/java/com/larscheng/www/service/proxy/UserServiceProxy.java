package com.larscheng.www.service.proxy;

import com.larscheng.www.service.UserService;
import com.larscheng.www.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceProxy implements UserService {
    private UserServiceImpl userService;

    @Autowired
    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    private void log(String msg) {
        System.out.println("log-> " + msg );
    }

    public void add() {
        log(Thread.currentThread().getStackTrace()[1].getMethodName());
        userService.add();
    }

    public void del() {

        log(Thread.currentThread().getStackTrace()[1].getMethodName());

        userService.del();
    }

    public void update() {

        log(Thread.currentThread().getStackTrace()[1].getMethodName());

        userService.update();
    }

    public void query() {

        log(Thread.currentThread().getStackTrace()[1].getMethodName());

        userService.query();
    }
}
