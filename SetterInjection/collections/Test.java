package com.spring.b.SetterInjection.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/spring/SetterInjection/collections/config.xml");
		Hospital hospital = context.getBean(Hospital.class, "hospital");
		CarDealership carDealership = context.getBean(CarDealership.class,"dealership");
		Customer customer = context.getBean(Customer.class,"customer");
		CountryAndLangs cal = context.getBean(CountryAndLangs.class,"countryAndLangs");
		Student student = context.getBean(Student.class, "student");
		context.close();
		
		System.out.println("Injecting a List");
		System.out.println("Hospital Name: " + hospital.getName());
		System.out.println("Departments: " + hospital.getDepartments());
		System.out.println();
		
		System.out.println("Injecting a Set");
		System.out.println("Car Dealership Name: " + carDealership.getName());
		System.out.println("Models: " + carDealership.getModels());
		System.out.println();
		
		System.out.println("Injecting a Map");
		System.out.println("Customer Id: " + customer.getId());
		System.out.println("Products purchased: " + customer.getProducts());
		System.out.println();
		
		//Properties are maps that have key and value as both strings
		System.out.println("Injecting a Properties");
		System.out.println("Country and Languages: " + cal.getCountryAndLangs());
		System.out.println();
		
		System.out.println("Injecting an Object");
		System.out.println("Student: " + student.getName());
		System.out.println("Scores: " + student.getScores());
	}

}
