package com.spring.d.lifecycleMethods.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Patient Name: " + this.getName();
	}

	// adding init() and destory() methods using annotations
	
	@PostConstruct
	public void hi() {
		System.out.println("Hello " + this.getName() + ", welcome to General Hospital!");
	}

	@PreDestroy
	public void bye() {
		System.out.println("Goodbye for now, " +  this.getName() + "!");
	}
}
