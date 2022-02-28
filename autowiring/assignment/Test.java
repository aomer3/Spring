package com.spring.i.autowiring.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/i/autowiring/assignment/config.xml");
		Customer customer = context.getBean(Customer.class, "customer");
		
		System.out.println(customer);
		
	}

}
