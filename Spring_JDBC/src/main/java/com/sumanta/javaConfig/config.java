package com.sumanta.javaConfig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.sumanta.dao.StudentDao;
import com.sumanta.dao.StudentDaoImpl;

@Configuration
public class config {
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc");
		dataSource.setUsername("root");
		dataSource.setPassword("kiit");
		
		return dataSource;
		
	}
	
	@Bean("jdbc")
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		
		return jdbcTemplate;
		
	}
	
	@Bean("stDao")
	public StudentDao studentDao() {
		StudentDaoImpl dao=new StudentDaoImpl();
		dao.setJdbcTemplate(getJdbcTemplate());
		
		return dao;
		
	}

}
