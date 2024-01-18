package com.super_this_2;

public class B extends A {
	String color="Black";
	public void display(){
		String color="Green";
		System.out.println(color);
		System.out.println(this.color);
		System.out.println(super.color);
	}

}
