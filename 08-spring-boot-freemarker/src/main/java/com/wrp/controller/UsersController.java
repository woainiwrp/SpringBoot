package com.wrp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wrp.pojo.Users;
/**
 * SpringBoot整合jsp
 * @author Administrator
 *
 */
@Controller
public class UsersController {
	
   @RequestMapping("/showUsers")  
   public String showUsers(Model model){
	   
	   List<Users> list = new ArrayList<Users>();
	   list.add(new Users(1,"小名",20));
	   list.add(new Users(2,"小黑",22));
	   list.add(new Users(3,"小话",23));
	  //需要一个model对象
	   model.addAttribute("list", list);
	   //跳转视图
	   return "userList";
   }
}
