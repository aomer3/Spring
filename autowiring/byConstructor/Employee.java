package com.spring.i.autowiring.byConstructor;

public class Employee {
	private Address address;

	public Employee(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Address: " + this.getAddress();
	}

}
