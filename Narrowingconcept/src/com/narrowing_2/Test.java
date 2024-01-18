package com.narrowing_2;

public class Test {
	public void m1(Number n){ 		
		System.out.println("m1__Number"); 	
	} 	
	public void m1(int x){ 		
		System.out.println("m1___int"); 	
	} 	 
	public static void main(String[] args) {
			Test t=new Test(); 		
			t.m1(0); 		
			t.m1((Number)0); 	
	} 

}
