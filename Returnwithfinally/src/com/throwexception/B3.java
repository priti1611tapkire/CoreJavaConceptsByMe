package com.throwexception;

public class B3 {
	public void m2() throws ClassNotFoundException  { 		
		System.out.println("B3_________m2 Start"); 		
		Class.forName("Demmo.java"); 		
		System.out.println("B3_________m2 End"); 	
		} 
	

}
