package com.sumanta.javaconfig;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.support.DaoSupport;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.SystemPropertyUtils;

import com.sumanta.dao.StudentDao;
import com.sumanta.model.Student;

public class App {
	
	 public static void main(String[] args) throws SQLException {
		
		 ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
		  JdbcTemplate jd= context.getBean("jdbc", JdbcTemplate.class);
		 System.out.println(jd.getDataSource().getConnection());
		 
//		 String sql="insert into employee values(?,?,?)";
//		 int i= jd.update(sql,2,"Rockey","Pune");
//		 System.out.println("Successfully Inserted "+i);
		 
		 StudentDao dao=context.getBean("stDao",StudentDao.class);
		 
		 Student st=new Student();
//		 st.setId(2);
//		 st.setName("Sunny");
//		 st.setAddress("Pune");
//		 
//		 int i=dao.insert(st);
//		 System.out.println("Inserted Successfully "+i);
		 
		 
//		 st.setId(2);
//		 st.setName("Selmon");
//		 st.setAddress("Mumbai");
//		 
//		 int i=dao.updateDetails(st);
//		System.out.println("Update Successfully "+i);
		 
		 
//		 int i=dao.delete(2);
//		 System.out.println("Delete Successfully"+i);
		 
//		 Student student=dao.getStudentById(3);
//		 System.out.println(student);
		 
		 List<Student>list=dao.getAllStudent();
		 for(Student s:list) {
			 System.out.println(s);
		 }
		 
		 
		 

	}

}
