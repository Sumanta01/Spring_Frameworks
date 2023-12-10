package com.sumanta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sumanta.entity.Employee;
import com.sumanta.entity.Mobile;
import com.sumanta.repository.EmployeeReposit;
import com.sumanta.repository.MobileReposit;

@SpringBootApplication
public class SpringJpaMappingApplication  implements CommandLineRunner{
	
	@Autowired
	private EmployeeReposit employeeReposit;
	
	@Autowired
	private MobileReposit mobileReposit;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		Employee employee=new Employee();
//		employee.setEmpName("Alice");
//		
//		
//		Mobile mob=new Mobile();
//		mob.setMobName("Samsung S22");
//		
//		employee.setMobile(mob);
//		
//		mobileReposit.save(mob);
//		employeeReposit.save(employee);
//		
//		System.out.println("Succefully Saved!");
		
		Employee emp=employeeReposit.findById(1).get();
		System.out.println(emp);
		
		
	}

}
