package com.sumanta.javaConfig;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sumanta.dao.StudentDao;
import com.sumanta.model.Student;

public class App {
	public static void main(String[] args) throws SQLException {
		ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
		
		JdbcTemplate jd=context.getBean("jdbc",JdbcTemplate.class);
		System.out.println(jd.getDataSource().getConnection());
		
		/*String sql="insert into student(id,name,address) values(?,?,?)";
		int j=jd.update(sql,2,"Reewan","USA");
		System.out.println("Inserted successfully..."+j); */
		
		
		
		
		 StudentDao dao  =context.getBean("stDao",StudentDao.class);
	      
		    Student st=new Student();
		    st.setId(4);
		    st.setName("Harry");
		    st.setAddress("Korea");
		    
		    int i=dao.insert(st);
		    System.out.println("Inserted successfully..."+i);  
		      
		      //Update
		   /*   StudentDao dao1  =context.getBean("stDao",StudentDao.class);
		      Student st=new Student();
		      st.setId(4);
		      st.setName("Harvy");
		      st.setAddress("Korea");
		      int i=dao1.UpdateDetails(st);
		      System.out.println("Inserted Successfully...."+i);  */
		      
		      //Delete
		      
		     /* int i=dao.delete(4);
		      System.out.println("Deleted Successfully...."+i); */
		    
		      
//		        Student st=dao.getStudentById(2);
//		        System.out.println(st);
		        
		        
		   List<Student>  lst =  dao.getAllStudent();
		   for(Student stw:lst) {
			   System.out.println(stw);
		   }  
	}

}
