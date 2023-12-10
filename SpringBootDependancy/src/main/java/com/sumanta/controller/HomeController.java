package com.sumanta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sumanta.services.UserService;

@Controller
public class HomeController {
	
	//@Autowired
	private UserService userService;
	
	public HomeController(UserService userService) {
		this.userService=userService;
		
	}
	
	@RequestMapping("/")
	public String home() {
		
		return "home";
		
	}
	
	@RequestMapping("/createUser")
	public String registerUser() {
		String msgString=userService.saveUser();
		System.out.println(msgString);
		return "success";
	}

}
