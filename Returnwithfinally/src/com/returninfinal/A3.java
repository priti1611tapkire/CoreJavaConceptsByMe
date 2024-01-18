package com.returninfinal;

public class A3 {
	int x=10;
	public int m1(){
		
	try{
		System.out.println("try----start");
		return x;
	}
	finally{
		x=40;
		System.out.println("finally block:" +x);
		return x;
	}
	
 }
 public static void main(String[] args) {
	System.out.println("main start");
	A3 a=new A3();
	int x=a.m1();
	System.out.println(x);
}
}
