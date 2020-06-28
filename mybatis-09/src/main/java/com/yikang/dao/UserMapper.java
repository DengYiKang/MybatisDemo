package com.yikang.dao;

import com.yikang.model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface UserMapper {

    List<User> getUsersById(@Param("id") int id);
}

