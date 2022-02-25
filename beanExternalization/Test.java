package com.spring.h.beanExternalization;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/beanExternalization/config.xml");
		MyDAO myDAO = context.getBean(MyDAO.class, "myDAO");
		
		System.out.println(myDAO);
	}

}
