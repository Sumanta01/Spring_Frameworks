package com.sumanta.spcl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("#{22+43}")
	public int sum;
	
	@Value("#{77-35}")
	public int sub;
	
	@Value("#{33*21}")
	public int mul;
	
	@Value("#{65/23}")
	public int div;

	@Override
	public String toString() {
		return "Student [sum=" + sum + ", sub=" + sub + ", mul=" + mul + ", div=" + div + "]";
	}
	
	
	

}
