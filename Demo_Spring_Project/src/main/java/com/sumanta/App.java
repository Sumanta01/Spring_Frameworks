package com.sumanta;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sumanta.primitive.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/sumanta/primitive/config.xml");
        Student student=context.getBean("St1",Student.class);
        Student student2=context.getBean("St2",Student.class);
        System.out.println(student2);
        
        System.out.println(student);
    }
}
