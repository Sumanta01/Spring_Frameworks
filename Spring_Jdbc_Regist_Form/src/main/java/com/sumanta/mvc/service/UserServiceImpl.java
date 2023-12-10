package com.sumanta.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumanta.mvc.dao.UserDao;
import com.sumanta.mvc.entity.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public int registUser(User user) {
		int i=userDao.saveUser(user);
		
		return i;
	}

}
