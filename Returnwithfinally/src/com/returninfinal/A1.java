package com.returninfinal;

public class A1 {
	public int m1(){
		int x=10;
			try{
				System.out.println("try----start");
				return x;
			}
			finally{
				System.out.println("finally block");
				return x;
			}
			
	     }
		 public static void main(String[] args) {
			System.out.println("main start");
			A1 a=new A1();
			int x=a.m1();
			System.out.println(x);
		}
}


