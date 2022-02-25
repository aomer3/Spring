package com.spring.g.constructorInjection.elements;

public class Employee {
	private int id;
	private Address address;

	public Employee(int id, Address address) {
		super();
		this.id = id;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Employee id: " + this.getId() + "\n" + "Address: " + this.getAddress();
	}

}
