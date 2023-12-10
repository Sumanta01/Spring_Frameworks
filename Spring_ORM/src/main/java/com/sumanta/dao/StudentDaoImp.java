package com.sumanta.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.sumanta.Student;

public class StudentDaoImp implements StudentDao {
	private HibernateTemplate hibernateTemplate;
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
   @Transactional
	public int saveStudent(Student student) {
		// TODO Auto-generated method stub
		int i=(Integer) hibernateTemplate.save(student);
		return i;
	}

	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		Student st=hibernateTemplate.get(Student.class, id);
		return st;
	}

	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		List<Student>list=hibernateTemplate.loadAll(Student.class);
		return list;
	}
   @Transactional
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(student);
	}
   
   @Transactional

	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		Student st=hibernateTemplate.get(Student.class, id);
		hibernateTemplate.delete(st);
		
	}
	
	

}
