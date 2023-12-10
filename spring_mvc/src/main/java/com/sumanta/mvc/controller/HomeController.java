package com.sumanta.mvc.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home( Model m) {
		m.addAttribute("name","Sumanta");
		m.addAttribute("roll",2170199);
		List<String>list=new ArrayList<String>();
		list.add("Stuart");
		list.add("Sunny");
		list.add("Sophia");
		list.add("Mia");
		list.add("Johny");
		m.addAttribute("ListName",list);
		
		return "home";
	}
	
	@RequestMapping("/login")
	public ModelAndView login() {
		
		ModelAndView model=new ModelAndView();
		model.addObject("Class","12th Class");
		model.addObject("RegNo",21635378);
		List<String>lst=new ArrayList<String>();
		lst.add("Numpy");
		lst.add("Matplotlib");
		lst.add("Pandas");
		lst.add("Scipy");
		lst.add("PySpark");
		model.addObject("LstName",lst);
		model.setViewName("login");
		return model;
	}
}
