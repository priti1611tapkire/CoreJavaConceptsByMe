package com.superthis_3;

public class Child extends Parent {
	   public Child(){ 	
		   this(10); 		 
		   System.out.println("Constructor_child"); 		//3 Constructor_child
		   												
		   } 	  
	   public void msg(){ 	
		   
	   } 	  
	   public void display(){ 
		   msg(); 	 
	   } 	  
	   public Child(float x){	 	
		   super(); 		 
		   System.out.println("float_Constructor_child"); 	  // 2float_Constructor_child
	  } 	  
	   public static void main(String args[]){	
		   Child c= new Child();	 		
		   c.display();  	   
		   } 
}
	


