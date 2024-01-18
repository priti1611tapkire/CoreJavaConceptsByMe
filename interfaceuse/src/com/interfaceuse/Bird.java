package com.interfaceuse;

public class Bird {
	public static void main(String[] args) {         
		Fly f1 = new Duck();        
		f1.goForward();        
		f1.goDown();         
		Fly f2 = new Finch();         
		f2.goForward();        
		f2.goDown();    
		} 

}
