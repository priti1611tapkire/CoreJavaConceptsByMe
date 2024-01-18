package com.throwtask;

public class Number {
	public void getNumber(int i) throws ZeroInputException
	{ 		
		System.out.println("start");
		if(i==0){
		ZeroInputException e= new ZeroInputException("Zero input number ");
		throw e;
	}
	}
}
