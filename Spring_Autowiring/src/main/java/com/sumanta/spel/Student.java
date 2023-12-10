package com.sumanta.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.StaticApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("#{33+66}")
	public int sum;
	
	@Value("#{33-13}")
	public int sub;
	
	@Value("#{45/9}")
	public int div;
	
	@Value("#{32*8}")
	public int mul;
	
	@Value("#{6==7}")
	public boolean equal;
	
	@Value("#{65>23 ? 34/2:34*2}")
	public int TernaryCheck;
	
	@Value("#{T(java.lang.Math).sqrt(256)}")
	public int num;
	
	@Value("#{T(java.lang.Math).PI}")
	public int val;
	
	public static void call() {
		System.out.println("call method is on the way........");
	}
	
	@Value("#{T(com.sumanta.spel.Student).call()}")
	public String result;
	

	@Override
	public String toString() {
		return "Student [sum=" + sum + ", sub=" + sub + ", div=" + div + ", mul=" + mul + "]";
	}
	

}
