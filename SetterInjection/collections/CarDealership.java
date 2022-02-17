package com.spring.b.SetterInjection.collections;

import java.util.Set;

//Dependency injection with a set 
public class CarDealership {
	String name;
	Set<String> models;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getModels() {
		return models;
	}

	public void setModels(Set<String> models) {
		this.models = models;
	}

}
