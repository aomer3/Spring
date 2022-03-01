package com.spring.m.interfaceInjection.annotations;

import org.springframework.stereotype.Component;

@Component("dao")
public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrer() {
		System.out.println("Inside OrderDAO's createOrder()");

	}
	
	

}
