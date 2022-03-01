package com.spring.l.springExpressionLanguage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/l/springExpressionLanguage/config.xml");

		Instructor instructor = (Instructor) context.getBean("instructor");
		
		System.out.println(instructor);
	}

}
