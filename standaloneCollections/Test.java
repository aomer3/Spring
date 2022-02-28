package com.spring.j.standaloneCollections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/j/standaloneCollections/config.xml");
		ProductList productList = context.getBean(ProductList.class, "productList");
		System.out.println(productList);
	}

}
