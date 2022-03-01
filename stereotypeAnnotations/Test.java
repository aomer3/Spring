package com.spring.k.stereotypeAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/k/stereotypeAnnotations/config.xml");

		Instructor instructor = (Instructor) context.getBean("i2");
		Instructor instructor2 = (Instructor) context.getBean("i2");
		
		//@Scope
		//System.out.println(instructor.hashCode());
		//System.out.println(instructor2.hashCode());
		
		//@Value
		System.out.println(instructor);
	}

}
