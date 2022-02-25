package com.spring.e.innerBean;

public class Employee {
	private int id;
	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee id: " + this.getId() + "\n" +
	           "Address: " + this.getAddress();
	}
	
	

}
