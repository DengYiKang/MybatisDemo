package com.yikang.dao;


import com.yikang.model.User;

import java.util.HashMap;
import java.util.List;

public interface UserMapper {
    User getUserById(int id);
    List<User> getUserByLimit(HashMap<String, Integer> map);
}
