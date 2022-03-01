package com.spring.k.stereotypeAnnotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("i2")
@Scope("prototype")
public class Instructor {
	@Value("998")
	private int id;

	@Value("Alan")
	private String name;

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

	@Override
	public String toString() {
		return "Instructor Id: " + this.getId() + "\n" + 
	           "Instructor Name: " + this.getName() + "\n" + 
			   "Subjects: " + this.getSubjects() + "\n" +
			   this.getProfile();
	}

}
