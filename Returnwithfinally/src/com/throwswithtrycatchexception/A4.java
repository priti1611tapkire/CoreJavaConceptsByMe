package com.throwswithtrycatchexception;

public class A4 {
	public void m1() { 			
		System.out.println("m1________A4___Start"); 			
		B4 b=new B4(); 
			//try{
				b.m2(); 	
			//}
			//catch(NullPointerException e){
				//System.out.println("catch block");
			//}
		System.out.println("m1_______A4____End"); 		
		} 		
	public static void main(String[] args){ 		
		System.out.println("main _________start"); 			
		A4 a=new A4(); 	
		try{
							
			a.m1(); 
		 }
		catch(NullPointerException e){
			System.out.println("catch block");
		}
					
		System.out.println("main __________End"); 		
		} 	
} 



