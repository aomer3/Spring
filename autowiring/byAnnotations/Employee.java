package com.spring.i.autowiring.byAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//@Autowired can be used three ways: on field, constructor or setter method
public class Employee {
	
	@Autowired
	@Qualifier("address2")
	private Address address;

	@Override
	public String toString() {
		return "Address: " + this.address;
	}

}
