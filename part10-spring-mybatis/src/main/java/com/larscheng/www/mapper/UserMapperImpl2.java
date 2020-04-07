package com.larscheng.www.mapper;

import com.larscheng.www.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {

    @Override
    public List<User> selectUserList() {
        return getSqlSession().getMapper(UserMapper.class).selectUserList();
    }
}
