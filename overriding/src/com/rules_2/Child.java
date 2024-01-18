package com.rules_2;

public class Child extends Parents{
    @Override     
    public void diplay() {          
    	System.out.println("Child_diplay_method");      
    	}    
         private void m1(){
    		System.out.println("child_m1");     
    	}   
    	@Override  
    	public void m2(){    
    		System.out.println("child_m2");   
    	}  
    	public static void m3(){      
    		System.out.println("child_m3");   
    	} 

  
}
