package com.sumanta.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sumanta.mvc.entity.User;
import com.sumanta.mvc.service.UserService;



@Controller
public class HomeController {
	@Autowired
	private UserService UserService;
	
	@RequestMapping("/home")
	public String homepage() {
		
		return "home";
	}

	@RequestMapping("/Regist")
	public String Register() {
		return "Regist";
	}
	
	@RequestMapping(path = "/createUser" ,method=RequestMethod.POST)
	public String registerUser(@ ModelAttribute User user, @RequestParam("pin") String pin,Model m) {
		
		user.setPin(pin);
		UserService.registUser(user);
		m.addAttribute("user",user);
		//return "redirect:/Regist";
		
		return "success";
		
	}
	

}
