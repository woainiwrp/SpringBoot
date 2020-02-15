package com.wrp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wrp.mapper.Usermapper;
import com.wrp.pojo.Users;
import com.wrp.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private Usermapper userMapper;
	@Override
	public void addUsers(Users users) {
		userMapper.insertUser(users);
	}
	
	@Override
	public List<Users> findAllUser() {
		return userMapper.selectUsersAll();
		
	}

	@Override
	public Users findUserById(Integer id) {
		return userMapper.selectUserById(id);
	}

	@Override
	public void updateUser(Users user) {
			userMapper.updateUser(user);
	}

	@Override
	public void deleteUserById(Integer id) {
		userMapper.deleteUserById(id);
	}

}
