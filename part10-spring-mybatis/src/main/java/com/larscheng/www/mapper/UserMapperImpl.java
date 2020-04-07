package com.larscheng.www.mapper;

import com.larscheng.www.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> selectUserList() {
        return sqlSession.getMapper(UserMapper.class).selectUserList();
    }
}
