package com.yikang;

import com.yikang.dao.UserMapper;
import com.yikang.model.User;
import com.yikang.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;


public class UserDaoTest {


    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1, "yikang");
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void getUserByLimitTest(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("size", 2);
        map.put("offset", 1);
        List<User> userList = mapper.getUserByLimit(map);
        System.out.println(userList);
        sqlSession.close();
    }
    @Test
    public void getUserByLikeTest(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserByLike("yi");
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void addUserTest(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        mapper.addUser(new User(0, "等", "11112222"));
        sqlSession.close();
    }
}
