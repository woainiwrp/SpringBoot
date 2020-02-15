package com.wrp.service;

import java.util.List;

import com.wrp.pojo.Users;

public interface UserService {
   void addUsers(Users users);
   List<Users> findAllUser();
   Users findUserById(Integer id);
   void updateUser(Users user);
   void deleteUserById(Integer id);
}
