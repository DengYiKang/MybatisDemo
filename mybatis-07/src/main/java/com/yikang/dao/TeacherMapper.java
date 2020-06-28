package com.yikang.dao;

import com.yikang.model.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {

    Teacher getTeacherById(@Param("id") int id);

    Teacher getTeacherById2(@Param("id") int id);

}
