package com.spring.d.lifecycleMethods.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/lifecycleMethods/annotations/config.xml");
		
		Patient patient = context.getBean(Patient.class,"patient");			
		System.out.println(patient);
		
		//Calling destroy(), to use shutdownhook must use AbstractApplicationContext
		context.registerShutdownHook();
		
	}

}
