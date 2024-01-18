package com.cjck.karvenagar;

public class C extends A {
	public void cc(){ 		
		A a=new A(); 	
		a.m1();
		a.m2();
		a.m4();
		//a.m3();...we cant call protected AM here also
		C c=new C();
		c.m1();
		c.m2();
		c.m4();
		
		
		
	} 
}
	


