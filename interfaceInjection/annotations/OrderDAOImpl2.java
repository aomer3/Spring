package com.spring.m.interfaceInjection.annotations;

import org.springframework.stereotype.Component;

@Component("dao2")
public class OrderDAOImpl2 implements OrderDAO {

	@Override
	public void createOrer() {
		System.out.println("Inside OrderDAO2's createOrder()");

	}
	
	

}
