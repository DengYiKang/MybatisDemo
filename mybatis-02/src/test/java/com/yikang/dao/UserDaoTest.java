package com.yikang.dao;

import com.yikang.model.User;
import com.yikang.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.getUserById(1));
        System.out.println(mapper.addUser(new User(0, "add", "333")));
        /*注意提交事务*/
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void updateTest(){
        SqlSession sqlSession=MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(new User(4, "aaa+1", "333"));
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void deleteTest(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(3);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void getUserListTest(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user:userList){
            System.out.println(user);
        }
    }
}
