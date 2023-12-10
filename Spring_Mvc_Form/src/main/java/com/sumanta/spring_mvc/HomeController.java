package com.sumanta.spring_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sumanta.spring_mvc.entity.User;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String homepage() {
		
		return "home";
	}

	@RequestMapping("/Regist")
	public String Register() {
		return "Regist";
	}
	
	@RequestMapping(path = "/createUser" ,method=RequestMethod.POST)
	public String registerUser(@ ModelAttribute User user, @RequestParam("pin") String pin) {
		
		System.out.println("Pin Name: "+pin);
		
		System.out.println("User Register Method called.....");
		System.out.println(user);
		
		return "Regist";
		
	}
	
	
}
