package com.eveningtask;

public class Test1 {
	public static void main(String[] args) {        
		try{ 		
			int i=10/0;               // arithmetic exception arrives
	System.out.println(i);       
	}        
		finally{         	
			System.out.println("finally block");         
			}       
		//catch(ArithmeticException e){         
		//	System.out.println("catch block");        
			//}    
		} 
}
