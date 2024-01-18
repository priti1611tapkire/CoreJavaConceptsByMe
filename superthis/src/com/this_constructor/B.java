package com.this_constructor;

public class B extends A {
	public B(){
		System.out.println("No-arg-constructor_B");
	}
	public B(String x){
		System.out.println("arg-constructor B");
	}
	public static void main(String[] args) {
		B b=new B();
		B b1=new B("cjc");
	}
	

}
