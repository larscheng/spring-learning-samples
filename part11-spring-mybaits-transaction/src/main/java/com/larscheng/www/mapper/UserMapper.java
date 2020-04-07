package com.larscheng.www.mapper;

import com.larscheng.www.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUserList();

    int insert(User user);

    int del(int id);

}
