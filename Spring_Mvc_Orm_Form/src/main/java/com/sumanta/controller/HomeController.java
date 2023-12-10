package com.sumanta.controller;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.graalvm.compiler.bytecode.Bytes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import com.sumanta.entity.User;
import com.sumanta.service.UserService;



@Controller
public class HomeController {
	
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/home")
	public String homepage() {
		
		return "home";
	}

	@RequestMapping("/Regist")
	public String Register() {
		return "Regist";
	}
	
	@RequestMapping(path = "/createUser" ,method=RequestMethod.POST)
	public String registerUser(@ ModelAttribute User user, @RequestParam("img") String img,Model m) {
		
		userService.saveUser(user);
		user.setPin(img);
		System.out.println(user);
		
		return "success";
		
	}
	
	@RequestMapping(path="/google")
	public String redirectPage() {
		
		return "redirect:https://www.google.com";
		
	}
	
	@RequestMapping(path="/yahoo")
	public  RedirectView redirectSecondWay() {
		
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl("https://in.search.yahoo.com/");
		
		return redirectView;
		
	}
	
	@RequestMapping(path="/user/{id}")
	public String demo(@PathVariable("id") int id) {
		System.out.println("Id: "+ id);
		return "home";
		
	}
	@RequestMapping(path="/file_upload")
	public String fileUpload() {
		return "file_upload";
	}
	
	@RequestMapping(path="/fileUpload", method=RequestMethod.POST)
	public String fileUpload(@RequestParam("img") CommonsMultipartFile file,HttpServletRequest req,Model m) throws IOException {
		
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getContentType());
		System.out.println(file.getSize());
		byte[] bytes=file.getBytes();
		String path=req.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"img"+File.pathSeparator+file.getOriginalFilename();
		System.out.println(path);
		FileOutputStream fos=new FileOutputStream(path);
		 try {
			fos.write(bytes);
			fos.close();
			System.out.println("File uploaded Successfully....");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 m.addAttribute("ImgName",file.getOriginalFilename());
		
		return "file_success";
		
	}

}
