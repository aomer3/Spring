package com.spring.b.SetterInjection.collections.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/spring/SetterInjection/collections/assignment/config.xml");
		ShoppingCart cart = context.getBean(ShoppingCart.class, "shoppingCart");
		context.close(); 
		
		System.out.println("Shopping Cart");
		System.out.println(cart.getBananas());
		System.out.println(cart.getBread());
		System.out.println(cart.getCereal());
		System.out.println(cart.getMilk());
		System.out.println(cart.getShrimp());
		System.out.println(cart.getWater());
	}

}
