package com.throwswithtrycatch;

public class A3 {
	public void m1() throws ClassNotFoundException { 	//	
		System.out.println("m1________A3_____Start"); //3.second print		
		B3 b=new B3(); 		
		b.m2(); 	//it directly going to m2 method of B3 class	// coming here & again by using throw we directly to m1 method main 
		System.out.println("m1_______A3____End"); 	
		} 	
	public static void main(String[] args){ 		
		System.out.println("main _________start"); //1.first print		
		A3 a=new A3(); 	
				try{
					//handle Exception here. 			
					a.m1(); //2. directly going to m1 method
				}
				catch(ClassNotFoundException e){
					System.out.println("catch block");
				}
		System.out.println("main __________End"); 	
		} 
	}


