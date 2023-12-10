package com.sumanta.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.sumanta.model.Student;

public class StudentDaoImpl implements StudentDao{
	
	private JdbcTemplate jdbcTemplate;
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {
		String sql="insert into student(id,name,address) values(?,?,?)";
		int i=jdbcTemplate.update(sql,student.getId(),student.getName(),student.getAddress());
		
		return i;
	}

	public int UpdateDetails(Student student) {
		
		String sql="update student set name=?,address=? where id=?";
		int i=jdbcTemplate.update(sql,student.getName(),student.getAddress(),student.getId());
		
		return i;
	}

	public int delete(int id) {
		String sql="delete from student where id=?";
		int i=jdbcTemplate.update(sql,id);
		return i;
	}

	public Student getStudentById(int id) {
		String sql="select * from student where id=?";
		RowMapper rowMapper=new RowMapper() {

			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Student student=new Student();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setAddress(rs.getString(3));
				return student;
			}
			
		};
		Student st=jdbcTemplate.queryForObject(sql, rowMapper,id);
		
		return st;
	}

	public List<Student> getAllStudent() {
		String sql="select * from student";
		
		RowMapper rowMapper=new RowMapper() {

			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Student student=new Student();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setAddress(rs.getString(3));
				return student;
			}
			
		};
	  List<Student> lst =  jdbcTemplate.query(sql, rowMapper);
		return lst;
	}

	public Student getStudentById() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	
	

}
