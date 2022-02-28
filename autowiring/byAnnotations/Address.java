package com.spring.i.autowiring.byAnnotations;

public class Address {
	private int houseNo;
	private String street;
	private String city;

	public Address(int houseNo, String street, String city) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return this.getHouseNo() + " " + this.getStreet() + " " + this.getCity();
	}

}
