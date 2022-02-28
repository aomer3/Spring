package com.spring.i.autowiring.byName;

public class Employee {
	private Address address;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address: " + this.getAddress();
	}

}
