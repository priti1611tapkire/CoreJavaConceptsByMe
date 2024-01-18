package com.throwkeyword;

public class Test1 {
	public void m1(int age){
		System.out.println("M1-----Start");
		if(age<0){
			AgeInvalidException e=new AgeInvalidException("Age Problem");
			throw e;
		}
		System.out.println("M1-----end");
	}
	public static void main(String[] args) {
			System.out.println("Main Start");
			try{
				Test1 t=new Test1();
				t.m1(-5);
			}
			catch(AgeInvalidException e){
				System.out.println("Catch----block:" +e.getMessage());
			}
	}

}
//Main Start
//M1-----Start
//Catch----block:Age Problem
