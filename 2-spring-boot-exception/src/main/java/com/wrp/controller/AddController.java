package com.wrp.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("/show2")
	public String showInfo2(){
		int a = 10/0;
		return "index";
	}
	
	/*@ExceptionHandler(value= {java.lang.NullPointerException.class})
	public ModelAndView handlerException(Exception e) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("error",e.toString());
		mv.setViewName("error");
		return mv;
	}*/

}
