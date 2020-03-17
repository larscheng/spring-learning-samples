package com.larscheng.www;

import com.larscheng.www.service.UserService;
import com.larscheng.www.service.impl.NormalUserServiceImpl;

/**
 * 描述:
 * 原始版测试
 *
 * @author larscheng
 * @date 2020/3/17 15:11
 */
public class NormalTest {
    public static void main(String[] args) {
        UserService userService = new NormalUserServiceImpl();
        //若要更换dao层实现方案，只能改代码
        userService.getUser();
    }
}
