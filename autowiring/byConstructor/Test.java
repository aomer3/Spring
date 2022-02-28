package com.spring.i.autowiring.byConstructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/i/autowiring/byConstructor/config.xml");
		Employee employee = context.getBean(Employee.class,"employee");
		
		System.out.println(employee);
		
	}

}
