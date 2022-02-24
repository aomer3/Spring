package com.spring.d.lifecycleMethods.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {
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

	// adding init() and destory() methods using interfaces
	
	// init()
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Hello " + this.getName() + ", welcome to General Hospital!");

	}

	// destroy()
	@Override
	public void destroy() throws Exception {
		System.out.println("Goodbye for now, " + this.getName() + "!");
	}
}
