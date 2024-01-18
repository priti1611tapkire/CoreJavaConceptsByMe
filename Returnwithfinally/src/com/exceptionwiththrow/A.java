package com.exceptionwiththrow;

import java.io.FileNotFoundException;
import java.io.FileReader;

//Q3. Check the code for throws keyword.
public class A {

	public void m1() throws FileNotFoundException {
				m2();
		
	}
	public void m2() throws FileNotFoundException {
		m3();	
	}
	public void m3() throws FileNotFoundException 
	{
		FileReader f=new FileReader("abc.txt");
	}
	public static void main(String[] args) throws FileNotFoundException  {
		try{
			A a=new A();
			a.m1();
		}
		catch(FileNotFoundException e){
				System.out.println("catch block");	
		}
		finally{
			System.out.println("finally block");
		}
		
	}
}


