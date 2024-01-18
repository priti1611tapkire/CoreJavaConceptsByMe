package com.this_constructor;

public class A {
	public A(){
		this(10.35f);
		System.out.println("No-arg-constructor A");
	}
	public A(int x)
	{
		this();
		System.out.println("int_arg-contructor _A");
	}
	public A(double x){
		System.out.println("double_arg-constructor_A");
	}
	
	

	
}
