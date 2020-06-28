package com.yikang;


import com.yikang.dao.UserMapper;
import com.yikang.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserDaoTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.getUsersById(1));
        System.out.println(mapper.getUsersById(2));
        System.out.println(mapper.getUsersById(1));
        System.out.println(mapper.getUsersById(2));
        sqlSession.close();
    }
}
