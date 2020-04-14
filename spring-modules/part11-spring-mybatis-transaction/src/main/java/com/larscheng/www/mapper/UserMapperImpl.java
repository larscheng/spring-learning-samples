package com.larscheng.www.mapper;

import com.larscheng.www.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {

    /**
     * 多个操作 事务测试
     * 未加入事务管理，insert成功，del失败，则添加成功删除失败，数据不一致
     * 加入事务管理，强一致性
     * @return
     */
    @Override
    public List<User> selectUserList() {
        //添加：
        insert(new User(7,"12312"));

        //删除
        del(2);


        return getSqlSession().getMapper(UserMapper.class).selectUserList();
    }

    @Override
    public int insert(User user) {
        return getSqlSession().getMapper(UserMapper.class).insert(user);
    }

    @Override
    public int del(int id) {
        return getSqlSession().getMapper(UserMapper.class).del(id);
    }
}
