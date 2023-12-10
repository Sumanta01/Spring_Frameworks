package com.sumanta.xml;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.sumanta.dao.StudentDao;
import com.sumanta.dao.StudentdaoImpl;
import com.sumanta.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    

	public static void main( String[] args ) throws SQLException
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/sumanta/xml/config.xml");
//        JdbcTemplate jd=context.getBean("jdbcTemplate", JdbcTemplate.class);
//        System.out.println(jd.getDataSource().getConnection());
        
//        String sql="insert into employee values(?,?,?)";
//        int i=jd.update(sql,3,"Rishi", "Hyderbada");
//        System.out.println(i);
        
//        String sql="update employee set name=?,address=? where id =?";
//        int i =jd.update(sql,"Sam","Mexico",3);
//        System.out.println(i);
        
//        String sql="delete from employee where id =?";
//        int i=jd.update(sql,2);
//        System.out.println(i);
        
//        String sql="select * from employee where id =?";
//        
//        RowMapper rowMapper=new RowMapper() {
//
//			@Override
//			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
//				// TODO Auto-generated method stub
//				String name=rs.getString(2);
//				return name;
//			}
//        	
//        };
//        String name=(String) jd.queryForObject(sql,rowMapper,1);
//        System.out.println(name);
        
//        String sql="select * from employee";
//        
//        RowMapper rowMapper=new RowMapper() {
//
//			@Override
//			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
//				// TODO Auto-generated method stub
//				
//				String name=rs.getString(2);
//				return name;
//			}
//        	
//        };
//        List<String>nameList=jd.query(sql,rowMapper);
//        for(String st:nameList) {
//        	System.out.println(st);
//        }
		
        StudentDao dao=context.getBean("stDao", StudentDao.class);
//        Student student=new Student();
//        student.setId(2);
//        student.setName("Sophia leonee");
//        student.setAddress("Colombia");
        
//        int i=dao.insert(student);
//        System.out.println("Inserted Successfully "+ i);
        
//        int i=dao.updateDetails(student);
//        System.out.println("Update Successfully "+i);
        
//       int i= dao.delete(2);
//       System.out.println("Deleted successfully "+i);
        
        
//        Student i=dao.getStudentById(3);
//        System.out.println(i);
        
        
        List<Student>li=dao.getAllStudent();
        for(Student st:li) {
        System.out.println(st);
        }
        
        
        
          
//        
        
    }
}
