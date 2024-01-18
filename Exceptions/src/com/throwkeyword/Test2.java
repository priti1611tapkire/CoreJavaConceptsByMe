package com.throwkeyword;

public class Test2 {
	public void m1(int age) throws AgeInvalideException{
		System.out.println("M1-----Start");
		if(age<0){
			AgeInvalideException e=new AgeInvalideException("Age problem");
			throw e;
		}
		System.out.println("M1-----end");
	}
	public static void main(String[] args) {
			System.out.println("Main Start");
			try{
				Test2 t=new Test2();
				t.m1(-5);
			}
			catch(AgeInvalideException e){
				System.out.println("Catch----block:" +e.getMessage());
			}
	}

}


