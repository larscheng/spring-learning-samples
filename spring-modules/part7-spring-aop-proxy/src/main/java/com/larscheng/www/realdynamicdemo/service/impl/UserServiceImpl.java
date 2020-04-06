package com.larscheng.www.realdynamicdemo.service.impl;

import com.larscheng.www.realdynamicdemo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    public void add() {
        System.out.println("添加........");
    }

    public void del() {
        System.out.println("删除..........");
    }

    public void update() {
        System.out.println("更新..........");
    }

    public void query() {
        System.out.println("查询..........");
    }
}
