package com.spring.f.dependencyCheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/dependencyCheck/config.xml");
		Prescription prescription = context.getBean(Prescription.class, "prescription");
		
		System.out.println(prescription);
	}

}
