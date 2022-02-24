package com.spring.c.scopes.singleton;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/scopes/singleton/config.xml");
		Prescription prescription = (Prescription) context.getBean("prescription");		
		Prescription prescription2 = (Prescription) context.getBean("prescription2");	
		Prescription prescription3 = (Prescription) context.getBean("prescription");		
		
		//Because by default the scope is singleton, the container will not create a new 
		//object when the same bean is referenced multiple times. 
		System.out.println(prescription.hashCode());
		System.out.println(prescription2.hashCode());
		System.out.println(prescription3.hashCode());

	}

}
