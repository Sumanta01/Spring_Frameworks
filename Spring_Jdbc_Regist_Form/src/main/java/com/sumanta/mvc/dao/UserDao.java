package com.sumanta.mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sumanta.mvc.entity.User;

@Repository
public class UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int saveUser(User user ) {
		
		String sql="insert into user(name,email,password,pin) values(?,?,?,?)";
		
		int i=jdbcTemplate.update(sql,user.getName(),user.getEmail(),user.getPassword(),user.getPin());
		
		return i;
		
		
	}

}
