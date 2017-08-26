package com.example.edgecases;

public class ClassInitialization extends ParentClass {
	static {
		System.out.println("static");
	}
	
	{
		System.out.println("block");
	}
	
	public ClassInitialization() {
		System.out.println("constructor");
	}	
}

class ParentClass {
	static {
		System.out.println("parent static");
	}
	
	{
		System.out.println("parent block");
	}
	
	public ParentClass() {
		System.out.println("parent constructor");
	}	
}
