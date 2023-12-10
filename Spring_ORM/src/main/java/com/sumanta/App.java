package com.sumanta;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.sumanta.dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "-----------------------" );
        
      ApplicationContext context=new ClassPathXmlApplicationContext("com/sumanta/config.xml");
      HibernateTemplate temp = context.getBean("template",HibernateTemplate.class);
     // System.out.println(temp);
      
    StudentDao dao = context.getBean("stDao",StudentDao.class);
    Student st=new Student();
//    st.setId(4);
//    st.setName("Pepe");
//    st.setAddress("Europe");
//    int i=dao.saveStudent(st);
//    System.out.println("Insert Successfully.......:" +i);
//      
//   Student st2=dao.getStudent(4);
//   System.out.println(st2);
//   
//        List<Student>list=dao.getAllStudent();
//        for(Student st3:list) {
//        	System.out.println(st3);
//        }
//        
    st.setId(4);
    st.setName("Seck");
    st.setAddress("Bangalore");
    dao.deleteStudent(4);
    System.out.println("Deleted suceessfully....");
        
       
    }
}
