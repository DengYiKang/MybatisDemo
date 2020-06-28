package com.yikang;

import com.yikang.dao.TeacherMapper;
import com.yikang.model.Student;
import com.yikang.model.Teacher;
import com.yikang.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;


public class TeacherDaoTest {


    @Test
    public void getStudentsTest(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        sqlSession.close();
    }

}
