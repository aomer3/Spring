package com.spring.k.stereotypeAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {
	@Value("Associate Professor")
	private String title;

	@Value("Information Technology")
	private String department;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Instructor Title: " + this.getTitle() + "\n" + 
	           "Department: " + this.getDepartment();
	}

}
