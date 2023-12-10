package com.sumanta.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sumanta.mvc.entity.User;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		
		return "home";
	}
	
	@RequestMapping("/register")
	public String SignUp() {
		
		return "register";
	}
	
	@RequestMapping(path="/createUser" ,method=RequestMethod.POST)
	public String registerUser(@ModelAttribute User user) {
		
		//System.out.println("userRegister Method Call");
		System.out.println(user);
		
		return "register";
	}
	

}
