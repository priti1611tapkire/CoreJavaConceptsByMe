package com.finallycase;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("main start");
		try{
			System.out.println("try---start");
			System.out.println(10/0);
			System.out.println("Try---end");
		}
		catch(ArithmeticException e){
			System.out.println("catch block");
		}
		finally{
			System.out.println("Finally block");
		}
		System.out.println("progrm---end");
	}

}
