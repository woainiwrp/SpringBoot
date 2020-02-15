package com.wrp.controller;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wrp.pojo.Users;

@Controller
public class DemoController {
	
	@RequestMapping("show")
    public String show(Model model) {
    	model.addAttribute("message","Thymeleaf入门案列一");
    	model.addAttribute("key", new Date());
    	return "index";
    }
	@RequestMapping("/show2")
	public String showInfo(Model model) {
		model.addAttribute("sex","男");
		model.addAttribute("id", "2");
		return "index2";
	}
	@RequestMapping("/show3")
	public String showInfo2(Model model) {
		List<Users> list = new ArrayList<>();
		list.add(new Users(1,"小明",24));
		list.add(new Users(2,"小话",22));
		list.add(new Users(3,"小你",23));
		model.addAttribute("list", list);
		return "index3";
	}
		
		
		@RequestMapping("/show4")
		public String showInfo4(Model model) {
			Map<String,Users> map = new HashMap<>();
			map.put("1", new Users(1,"笑话",20));
			map.put("2", new Users(1,"小白",21));
			map.put("3", new Users(3,"小英",22));
			model.addAttribute("map", map);
			return "index4";
	}

		@RequestMapping("/show5")
		public String showInfo5(Model model,HttpServletRequest request) {
			request.setAttribute("req", "request");
			request.getSession().setAttribute("sess", "session");
			request.getSession().getServletContext().setAttribute("app", "appliucation");
			return "index5";
			
		}
    
}
