package com.sumanta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumanta.dao.UserDao;
import com.sumanta.entity.User;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	
	public int saveUser(User user) {
		
		int i=userDao.save(user);
		
		return i;
		
		
	}
	
	

}
