package com.newinterface;

public class Test implements I2 {
	public void m2(){
		
		System.out.println("p");
	}
	public void m1(){
		System.out.println("m");
	}
	
	
	public static void main(String[] args) {
		I2 i = new Test(); 	
		i.m1();
		i.m2();
		I1 i1=new Test(); 	
		i1.m1();
		Test t=new Test();
		t.m1();
		t.m2();
	}
	}
	
	
	
