package com.wrp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wrp.pojo.Users;
import com.wrp.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;
    /**
     * 页面跳转
     */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page) {
		return page;
	}
	@RequestMapping("/addUser")
	public String addUser(Users users) {
		userService.addUsers(users);
		return "ok";
	}
	
	//查询用户
	@RequestMapping("/findAllUser")
	public String findAllUser(Model model) {
		List<Users> list = userService.findAllUser();
		model.addAttribute("list", list);
		return "find";
	}
	
	//通过id查询用户
		@RequestMapping("/findUserById")
		public String findUserById(Model model,Integer id) {
			Users user = userService.findUserById(id);
			model.addAttribute("user", user);
			return "findById";
		}
		/*
		 * 更新用户
		 */
		@RequestMapping("/edit")
		public String updateUser(Users user) {
			userService.updateUser(user);
			return "ok";
		}
		/*
		 * 根据ID删除用户
		 */
		@RequestMapping("/delete")
		public String deleteUserById(Integer id) {
			userService.deleteUserById(id);
			return "ok";
		}
}
