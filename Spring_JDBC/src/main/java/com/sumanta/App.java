package com.sumanta;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.support.DaoSupport;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.sumanta.dao.StudentDao;
import com.sumanta.model.Student;

/**
 * Hello world!
 *
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
      ApplicationContext context=new ClassPathXmlApplicationContext("com/sumanta/config.xml");
//      JdbcTemplate jd = context.getBean("jdbcTemplate",JdbcTemplate.class);
//      System.out.println(jd.getDataSource().getConnection());
      
     //Insert
//     String sql="insert into student(id,name,address) values(?,?,?)";
//     int j= jd.update(sql,1,"Sumanta","india");
//     System.out.println("Successfully inserted...."+j);
    /* String sql2="insert into student(id,name,address)values(?,?,?)";
     int k= jd.update(sql2,3,"Seeny","London");
     System.out.println("Successfully inserted...."+k); */
      
     //Update
      
     /* String sql="update student set name=?,address=? where id=? ";
      int m=jd.update(sql,"Stuart","Russia",3);
      System.out.println("Successfully inserted...."+m);  */
      
      //Delete
//      String sql="delete from student where id=?";
//      int m=jd.update(sql,3);
//      System.out.println("Successfully inserted...."+m);
      
      
      // Fetch data by id
     /* String sql="select * from student where id=?";
      RowMapper rowMapper=new RowMapper() {

		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			String name=rs.getString(2);
			return name;
		}
    	  
    	  
	};
      
    String name =jd.queryForObject(sql, rowMapper,1);
    System.out.println(name);  */
      
      
      
      
    /*  String sql="select * from student ";
      RowMapper rowMapper=new RowMapper() {

		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			String name=rs.getString(2);
			
			return name;
		}
    	  
	};
	  List<String>list=jd.query(sql, rowMapper);
	  for(String name:list) {
		  System.out.println(name);
	  }    */
      
      //Insert
   
      StudentDao dao  =context.getBean("stDao",StudentDao.class);
      
    Student st=new Student();
    st.setId(3);
    st.setName("Elish");
    st.setAddress("Germany");
    
    int i=dao.insert(st);
    System.out.println("Inserted successfully..."+i);  
      
      //Update
      /* StudentDao dao  =context.getBean("stDao",StudentDao.class);
      Student st=new Student();
      st.setId(3);
      st.setName("Elish");
      st.setAddress("Korea");
      int i=dao.UpdateDetails(st);
      System.out.println("Inserted Successfully...."+i); */
      
      //Delete
      
//      int i=dao.delete(3);
//      System.out.println("Deleted Successfully...."+i);
    
      
//        Student st=dao.getStudentById(2);
//        System.out.println(st);
        
        
   List<Student>  lst =  dao.getAllStudent();
   for(Student stw:lst) {
	   System.out.println(stw);
   }
      
      
      
      
      
      
     
    }
}
