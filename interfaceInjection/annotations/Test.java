package com.spring.m.interfaceInjection.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/m/interfaceInjection/annotations/config.xml");
		OrderBO bo = (OrderBO) context.getBean("bo");

		bo.placeOrder();
		
		
	}

}
