package com.spring.g.constructorInjection.ambiguity;

public class Addition {
	
	Addition(double a, double b){
		System.out.println("Inside DOUBLE constructor");
	}
	
	Addition(int a, int b){
		System.out.println("Inside INT constructor");
	}
	
	Addition(String a, String b){
		System.out.println("Inside STRING constructor");
	}

}
