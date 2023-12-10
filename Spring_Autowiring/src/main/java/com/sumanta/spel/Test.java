package com.sumanta.spel;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	public static void main(String[] args)  {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/sumanta/spel/config.xml");
		Student st=context.getBean("student",Student.class);
		System.out.println(st.TernaryCheck);
		System.out.println(st.num);
		System.out.println(st.val);
		System.out.println(st.result);
		
	   SpelExpressionParser parser =new SpelExpressionParser();
		
	   org.springframework.expression.Expression ex=parser.parseExpression("'Hello Sumanta'");
	   System.out.println(ex.getValue());
	}

}
