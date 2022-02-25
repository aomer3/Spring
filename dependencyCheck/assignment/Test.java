package com.spring.f.dependencyCheck.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/dependencyCheck/assignment/config.xml");
		University university = (University) context.getBean("university");
		University university2 = (University) context.getBean("university");
		context.close();
		
		System.out.println(university.hashCode());
		System.out.println(university2.hashCode());
	}

}
