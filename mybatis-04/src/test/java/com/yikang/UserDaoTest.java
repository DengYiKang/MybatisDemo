package com.yikang;

import com.yikang.dao.UserMapper;
import com.yikang.model.User;
import com.yikang.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;


public class UserDaoTest {

    static Logger logger = Logger.getLogger(UserDaoTest.class);

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(2);
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
    public void logTest(){
        logger.info("info: enter into logTest");
        logger.debug("debug: enter into logTest");
        logger.error("error: enter into logTest");
    }
}
