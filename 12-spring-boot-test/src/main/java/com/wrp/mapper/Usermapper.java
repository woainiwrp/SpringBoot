package com.wrp.mapper;

import java.util.List;

import com.wrp.pojo.Users;

public interface Usermapper {
    void insertUser(Users users);
    List<Users> selectUsersAll();
    Users selectUserById(Integer id);
    void updateUser(Users user);
    void deleteUserById(Integer id);
}
