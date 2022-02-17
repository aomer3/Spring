package com.spring.b.SetterInjection.collections;

import java.util.List;

//Dependency injection with a list 
public class Hospital {
	String name;
	List<String> departments;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getDepartments() {
		return departments;
	}

	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}

}
