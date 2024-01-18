package com.bankinterface;

public class Test {
	public static void main(String[] args) {
		RBI i=new SBI();   	
		System.out.println("SBI Rate of Interest: "+i.getRateOfInterest());   	
		RBI  i1=new ICICI();   	
		System.out.println("ICICI Rate of Interest: "+i1.getRateOfInterest());   	
		RBI i2=new AXIS();   	
		System.out.println("AXIS Rate of Interest: "+i2.getRateOfInterest());   
		
	}

}
