package com.block;

public class Test {
	public Test(){
		System.out.println("Constructor");
	}
	
	{
		System.out.println("Non Static Block");
	}
	
	static{
		System.out.println("Static Block");
	}
	//{
		//System.out.println("Non Static Block");
//	}
	public void m1(){
		System.out.println("Method M1");
	}
	
	
	public static void main(String[] args) {
		System.out.println("Main Method");
		Test t=new Test();
		Test t1=new Test();
		Test t2=new Test();
		t2.m1();
	}

}
