package com.larscheng.www.impl;

import org.springframework.stereotype.Service;
import com.larscheng.www.service.UserService;

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
