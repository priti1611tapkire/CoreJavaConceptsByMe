package com.uncheckedexception_throwtrycatch;

public class B1 {
	public void m2(){ 		
		System.out.println("B1_________m2 Start"); 		
		try{
		int a=10/0; 
		System.out.println(a); 		
		}
		catch(ArithmeticException e){
			System.out.println("catch block");
	    }
		System.out.println("B1_________m2 End"); 	
		} 

}
