package com.yikang;

import com.yikang.dao.StudentMapper;
import com.yikang.dao.TeacherMapper;
import com.yikang.model.Student;
import com.yikang.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;


public class StudentDaoTest {


    @Test
    public void getStudentsTest(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudents2();
        System.out.println(students);
        sqlSession.close();
    }

}
