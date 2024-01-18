package com.cjc;

public class Test {
	public static void main(String args[])
	{
		Student birendra=new Student();
		birendra.rollno=1;
		birendra.name="Birendra G.";
		
		Student avinash=new Student();
		avinash.rollno=2;
		avinash.name="Avinash V.";
		
		System.out.println(birendra.rollno);
		System.out.println(birendra.name);
		System.out.println(avinash.rollno);
		System.out.println(avinash.name);
	}

}
