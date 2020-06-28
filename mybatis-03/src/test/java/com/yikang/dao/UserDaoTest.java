package com.yikang.dao;

import com.yikang.model.User;
import com.yikang.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


public class UserDaoTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }
}
