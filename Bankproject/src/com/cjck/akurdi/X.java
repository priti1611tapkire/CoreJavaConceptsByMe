package com.cjck.akurdi;

import com.cjck.karvenagar.A;

public class X extends A{ 	 
	public void xx(){	                 
		A a=new A(); 		
		a.m1();//.....public AM we can accses anywhere
		X x=new X(); 		
		x.m1();// public 
		x.m4();//protected because Class X is a sub class of A
		} 
}

