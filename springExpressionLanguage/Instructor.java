package com.spring.l.springExpressionLanguage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Instructor {
//	@Value("5") //simple assignment 
//	@Value("#{66+44}") //performing calculations 
	@Value("#{new Integer(88)}") //creating objects
	private int id;

	@Value("#{'Alan'.toUpperCase()}") //creating Strings and using String methods
	private String name;

	//@Value("#{T(java.lang.Integer).MAX_VALUE}") //using static variables
	@Value("#{T(java.lang.Math).abs(-5)}") //using static methods
	private int yearsTeaching;

	@Value("#{2+4>5?true:false}") //boolean expression
	private boolean active;
	
	@Value("#{subjectList}")
	private List<String> subjects;

	@Autowired
	private Profile profile;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public int getYearsTeaching() {
		return yearsTeaching;
	}

	public void setYearsTeaching(int yearsTeaching) {
		this.yearsTeaching = yearsTeaching;
	}	

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Instructor Id: " + this.getId() + "\n" + 
	           "Instructor Name: " + this.getName() + "\n" + 
			   "Years Teaching: " + this.getYearsTeaching() + "\n" +
	           "Active: " + this.isActive() + "\n" + 
			   "Subjects: " + this.getSubjects() + "\n" + 
	           this.getProfile();
	}

}
