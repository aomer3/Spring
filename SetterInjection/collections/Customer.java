package com.spring.b.SetterInjection.collections;

import java.util.Map;

//Dependency injection with a map 
public class Customer {
	private int id;
	Map<Integer, String> products;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Map<Integer, String> getProducts() {
		return products;
	}

	public void setProducts(Map<Integer, String> products) {
		this.products = products;
	}

}
