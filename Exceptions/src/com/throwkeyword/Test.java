package com.throwkeyword;

public class Test {
	public void m1(){
		System.out.println("m1----start");
		int age=0;
		if(age<0){
			ArithmeticException e=new ArithmeticException("Age Problem");
		    throw e;
		}
		System.out.println("m1----end");
	}
	public static void main(String[] args) {
		System.out.println("Main Start");
		Test t=new Test();
		try{
			t.m1();
		}
		catch(ArithmeticException e){
			System.out.println("Catch block");
		}
		System.out.println("Main end");
	}
}
