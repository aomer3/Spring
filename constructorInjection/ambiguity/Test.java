package com.spring.g.constructorInjection.ambiguity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/constructorInjection/ambiguity/config.xml");
		Addition addition = context.getBean(Addition.class,"addition");
		Subtraction subtraction = context.getBean(Subtraction.class, "subtraction");
				
	}

}
