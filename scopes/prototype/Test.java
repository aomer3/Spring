package com.spring.c.scopes.prototype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/scopes/prototype/config.xml");
		Prescription prescription = (Prescription) context.getBean("prescription");		
		Prescription prescription2 = (Prescription) context.getBean("prescription2");	
		Prescription prescription3 = (Prescription) context.getBean("prescription");		
		
		//When the scope is prototype, even when the same bean is referenced by the 
		//container, the container will create a new object for each time the same bean
		//is referenced. 
		System.out.println(prescription.hashCode());
		System.out.println(prescription2.hashCode());
		System.out.println(prescription3.hashCode());

	}

}
