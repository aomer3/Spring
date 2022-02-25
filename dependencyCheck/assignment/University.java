package com.spring.f.dependencyCheck.assignment;

import org.springframework.beans.factory.annotation.Required;

public class University {
	private int id;
	private String name;
	private String location;
	
	@Required
	public void setId(int id) {
		this.id = id;
	}
	
	@Required
	public void setName(String name) {
		this.name = name;
	}
	
	@Required
	public void setLocation(String location) {
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	@Override
	public String toString() {
		return "University Id: " + this.getId() + " | " +
			   "Name: " + this.getName() + " | " +
			   "Location: " + this.getLocation();
	}
	
	

}
