package com.statick;

public class A {
	static int x;
	int y;
	public static void main(String[] args) {
		A a=new A();
		a.x=10;
		a.y=20;
		
		A a1=new A();
		a1.x=100;
		a1.y=200;
		
		System.out.println("With a object x= "+a.x);
		System.out.println("With a object x= "+a.y);
		System.out.println("With a object x= "+a1.x);
		System.out.println("With a object x= "+a1.y);
	}

}
