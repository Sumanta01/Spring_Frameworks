package com.sumanta.mvc.controller;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@RequestMapping("/site")
@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(Model m) {
		m.addAttribute("name","Sumanta");
		m.addAttribute("roll",2170199);
		List<String>list= new ArrayList<String>();
		list.add("Sumanta");
		list.add("Seek");
		list.add("Rek");
		list.add("Neen");
			
		m.addAttribute("list",list);
		
		
		return "home";
		
	}
	
	@RequestMapping("/LogIn")
	public ModelAndView LoginPage() {
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("Class","MCA");
		modelAndView.addObject("RegNo",2187786);
		modelAndView.setViewName("LogIn");
		
		return modelAndView;
	}
	
	

}
