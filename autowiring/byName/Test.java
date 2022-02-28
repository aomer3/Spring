package com.spring.i.autowiring.byName;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/i/autowiring/byName/config.xml");
		Employee employee = context.getBean(Employee.class,"employee");
		
		System.out.println(employee);
		
	}

}
