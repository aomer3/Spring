package com.spring.b.SetterInjection.primitives;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/spring/SetterInjection/primitives/config.xml");
		Employee employee = (Employee) context.getBean("emp");
		Employee employee2 = (Employee) context.getBean("emp2");
		Employee employee3 = (Employee) context.getBean("emp3");
		context.close();
		
		System.out.println("Employee 1");
		System.out.println("Employee Id: " + employee.getId());
		System.out.println("Employee Name: " + employee.getName());
		System.out.println();
		
		System.out.println("Employee 2");
		System.out.println("Employee Id: " + employee2.getId());
		System.out.println("Employee Name: " + employee2.getName());
		System.out.println();
		
		System.out.println("Employee 3");
		System.out.println("Employee Id: " + employee3.getId());
		System.out.println("Employee Name: " + employee3.getName());
	}
}
