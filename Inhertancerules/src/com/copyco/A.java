package com.copyco;

public class A {
	int x;
	 A(A a){
		x=a.x;
		System.out.println(x);
	}
	public A(int x){
		this.x=x;
	}
	public static void main(String[] args) {
		A a1=new A(10);
		A a2=new A(a1);
		
	}
}
