package com.spring.d.lifecycleMethods.xmlConfig;

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

	// adding init and destory methods (life cycle methods)
	public void hi() {
		System.out.println("Hello " + this.getName() + ", welcome to General Hospital!");
	}

	public void bye() {
		System.out.println("Goodbye for now, " +  this.getName() + "!");
	}
}
