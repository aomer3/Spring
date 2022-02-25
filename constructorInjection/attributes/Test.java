package com.spring.g.constructorInjection.attributes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/constructorInjection/attributes/config.xml");
		Employee employee = context.getBean(Employee.class,"employee");
		
		System.out.println(employee);
		
	}

}
