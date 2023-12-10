package com.sumanta.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.sumanta.Student;

public class StudentDaoImpl implements StudentDao{
	
	private HibernateTemplate hibernateTemplate;
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	@Transactional
	public int saveStudent(Student student) {
		// TODO Auto-generated method stub
		int i=(int) hibernateTemplate.save(student);
		return i;
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		
		Student st=hibernateTemplate.get(Student.class, id);
		
		return st;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		
		List<Student>list=hibernateTemplate.loadAll(Student.class);
		return list;
	}

	@Override
	@Transactional
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(student);
		
	}

	@Override
	@Transactional
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
	      Student st=hibernateTemplate.get(Student.class, id);
	      hibernateTemplate.delete(st);
		
		
	}

}
