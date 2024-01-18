package com.cjck.akurdi;

import com.cjck.karvenagar.A;

public class Z extends X { 
	public void zz(){          		
		Z z=new Z(); 	
		z.m1();//public we can access anywhere
		z.m4();//protected becz Z is a subclass of X and A
	  	X x=new X(); 
	  	x.m1();//only public
	  	A a=new A(); 
	  	a.m1();//only public
	    }           
	public static void main(String[] args) {
	// System.out.println(a);
	 
	} 
}


