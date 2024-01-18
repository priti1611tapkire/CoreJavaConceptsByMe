package com.finallycase;
//with problem or without problem finally block executed normally
public class Test {
	public static void main(String[] args) {
		System.out.println("main start");
		try{
			System.out.println("try---start");
			System.out.println(10/0);
			System.out.println("Try---end");
		}
		finally{
			System.out.println("Finally block");
		}
		System.out.println("progrm---end");
	}
	
	

}
