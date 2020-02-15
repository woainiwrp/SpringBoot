package com.wrp.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wrp.pojo.User;

@Controller
public class AddController {
	/*
	 * 页面跳转
	 */
	@RequestMapping("/addUser")
	public String showPages(User user) {
		return "add";
	}
	
	@RequestMapping("/save")
	public String addUser(@Valid User user,BindingResult result) {
		if(result.hasErrors()) {
			return "add";
		}
		System.out.println(user);
		return "ok";
	}

}
