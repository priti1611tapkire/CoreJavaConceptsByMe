package com.eveningtask;

public class Test2 {
	public static void main(String args[]){     
		System.out.println("Main------------Start");      
		try{        
			System.out.println("Try____Start");         
			int i=45/0; //arithmetic exception occurs directly goes towards catch block     
			System.out.println(i);     
			}    
		catch(ArrayIndexOutOfBoundsException e){       
			System.out.println("Catch _________Block"); //unexpected exception command    
			
			}      finally{         System.out.println("finally block");     
			    }      System.out.println("Main------------End");   
			    } 
		
	}


