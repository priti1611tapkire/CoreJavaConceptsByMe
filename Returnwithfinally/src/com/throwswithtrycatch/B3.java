package com.throwswithtrycatch;

public class B3 {
	public void m2() throws ClassNotFoundException { 	// throws towards m1 method	
		System.out.println("B3_________m2 Start"); 	//3.third print	
		Class.forName("A"); 	//exception occurs here we handover this exception by using throw to m1 class where m2 method called	
		System.out.println("B3_________m2 End"); 	
		} 
	

}
