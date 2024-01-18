package com.statick;

public class B {
	static int x;
	int y;
	public static void main(String[] args) {
		B b=new B();
		b.x=10;
		b.y=20;
		
		B b1=new B();
		b1.x=100;
		b1.y=200;
		
		B b2=new B(); 
		
		System.out.println("With a object x= "+b.x);
		System.out.println("With a object x= "+b.y);
		System.out.println("With a object x= "+b1.x);
		System.out.println("With a object x= "+b1.y);
		System.out.println("With a object x= "+b2.x);
		System.out.println("With a object x= "+b2.y);
		
	}

}
