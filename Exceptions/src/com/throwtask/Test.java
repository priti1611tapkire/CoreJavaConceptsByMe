package com.throwtask;

public class Test {
	public static void main(String[] args) { 	    	
		try{
			Number num = new Number(); 	
			num.getNumber(0); 	     	
		}
			 catch(ZeroInputException e){
				 System.out.println("Zero input number:"+e.getMessage());
			 }
		} 
}

