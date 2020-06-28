package com.yikang.dao;


import com.yikang.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

public interface UserMapper {
    @Select("select * from user where id = #{id} and name = #{name}")
    User getUserById(@Param("id") int id, @Param("name") String name);

    @Insert("insert into user (name, password) values (#{name}, #{password})")
    int addUser(User user);

    /*ERROR*/
    @Select("select * from user where name like %yi%")
    User getUserByLike(String name);

    List<User> getUserByLimit(HashMap<String, Integer> map);
}
