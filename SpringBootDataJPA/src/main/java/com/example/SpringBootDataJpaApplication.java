package com.example;

import java.util.List;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.entity.Student;
import com.example.repository.StudentRepo;

@SpringBootApplication
public class SpringBootDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootDataJpaApplication.class, args);
		
		StudentRepo studentRepo=context.getBean(StudentRepo.class);
		//System.out.println(studentRepo);
		
		Student student=new Student();
		Student student2=new Student();
		student.setName("Alice");
		student.setAddress("Italy");
		studentRepo.save(student);
		student2.setName("Sheikh");
		student2.setAddress("UAE");
		studentRepo.save(student2);
		
		
		List<Student>list=(List<Student>) studentRepo.findAll();
		for(Student st:list) {
			System.out.println(st);
		}
//		
//		Student student2=studentRepo.findById(3).get();
//		System.out.println(student2);
//		student2.setAddress("Russia");
//		studentRepo.save(student2);
		
//		Student st=studentRepo.findById(4).get();
//		
//		studentRepo.delete(st);
//		
//		System.out.println("Deleted Successfully");
		
//		Student student2=studentRepo.findByName("Nell");
//		System.out.println(student2);
		
//		Student student2=studentRepo.findByAddress("india");
//		System.out.println(student2);
//		
		
//		Student student2=studentRepo.findByNameAndAddress("Nell", "Russia");
//		System.out.println(student2);
		
//		Student student2=studentRepo.findByNameOrAddress("null", "India");
//		System.out.println(student2);
	
		
		
		
		
	}

}
