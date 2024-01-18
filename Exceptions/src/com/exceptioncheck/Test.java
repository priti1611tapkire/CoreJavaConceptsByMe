package com.exceptioncheck;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("main__________start");
			try{
				System.out.println("try start");
				A a=null;
				System.out.println("try end");
			}
			catch (NullPointerException e){
				Object a = null;
				//Object a;
				System.out.println(a.toString());
			} 
					    	
			System.out.println("main___________end");
		}


} 
