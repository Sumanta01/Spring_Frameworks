package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.example.entity.Student;
import java.util.List;


public interface StudentRepo extends JpaRepository<Student,Integer> {
	
	Student findByName(String name);
	
	Student findByAddress(String address);
	
	Student findByNameAndAddress(String name,String address);
	
	Student findByNameOrAddress(String name, String address);
	
	
	
	

}

