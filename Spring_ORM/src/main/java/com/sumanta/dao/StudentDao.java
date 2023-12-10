package com.sumanta.dao;

import java.util.*;

import com.sumanta.Student;
public interface StudentDao {
	
	public int saveStudent(Student student);
	public Student getStudent(int id);
	public List<Student> getAllStudent();
	public void updateStudent(Student student);
	public void deleteStudent(int id);

}
