package com.yikang.dao;

import com.yikang.model.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();
    List<User> getUserNameLike(String value);
    User getUserById(int id);
    int addUser(User user);
    int updateUser(User user);
    int deleteUser(int id);
}
