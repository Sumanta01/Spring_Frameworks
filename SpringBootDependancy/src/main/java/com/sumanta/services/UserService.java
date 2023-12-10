package com.sumanta.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sumanta.repository.UserDao;

@Component
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public String saveUser() {
		
		boolean p=userDao.save();
		if(p) {
			return "Registration Success";
		}
		else {
			return "Server error";
		}
		
		
	}

}
