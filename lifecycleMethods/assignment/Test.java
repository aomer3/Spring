package com.spring.d.lifecycleMethods.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/lifecycleMethods/assignment/config.xml");
		TicketReservation tr = context.getBean(TicketReservation.class, "ticketReservation");
		context.close();
	}
}
