package com.sumanta.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.sumanta.model.Student;

@Component("stDao")
public class StudentdaoImpl  implements StudentDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

//	public JdbcTemplate getJdbcTemplate() {
//		return jdbcTemplate;
//	}
//
//	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}

	@Override
	public int insert(Student student) {
		// TODO Auto-generated method stub
		String sql="insert into employee values(?,?,?)";
		int i=jdbcTemplate.update(sql,student.getId(),student.getName(),student.getAddress());
		return i;
	}

	@Override
	public int updateDetails(Student student) {
		// TODO Auto-generated method stub
		String sql="update employee set name=?,address=? where id =?";
	    int i=jdbcTemplate.update(sql,student.getName(),student.getAddress(),student.getId());
		return i;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String sql="delete from employee where id = ?";
	    int i=jdbcTemplate.update(sql, id);
	    
		return i;
	}
   
	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		String sql="select * from employee where id=? ";
		
		RowMapper rowMapper =new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				
				Student student=new Student();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setAddress(rs.getString(3));
				return student;
			}
			
			
		};
		
		Student st=(Student) jdbcTemplate.queryForObject(sql, rowMapper,id);
		return st;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		
		String sql="select * from employee";
		RowMapper rowMapper=new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Student student=new Student();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setAddress(rs.getString(3));
				return student;
			}
		};
		
		List<Student> getList=jdbcTemplate.query(sql,rowMapper);
		
		return getList;
	}
	
	

}
