package com.newtask;

public class A {
	public static void main(String[] args) { 		
		System.out.println("Main --------------Start"); 		
		try{ 			
			System.out.println("try___________start"); 			
			int i=Integer.parseInt("123"); 			
			System.out.println(i);                               //no exception ocuurs here so try block executed normally 			
			System.out.println("try___________end"); 		} 		
		catch(NumberFormatException e){ 			
			System.out.println("catch block"); //without exception catch block never executed 		
		} 
		finally{ 		
			System.out.println("finally block"); //finally compulsory executed without exception or with exception		
		} 		
		System.out.println("Main --------------End");  //program normally terminated
	   }   
	
	     {
         System.out.println("Main --------------End"); 	
         } 

}

