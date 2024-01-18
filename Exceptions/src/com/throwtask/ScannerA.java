package com.throwtask;
import java.util.Scanner;
//(if value of B is 0 print exception msg as "Not use Input value of 			
//B is Zero" otherwise print division of a and b).
public class ScannerA {
	public void div(int a, int b) throws InputValidException{ 	
	     if(b==0){
	      InputValidException i=new InputValidException("Not use Input value of B is Zero");
		  throw i;
         }
	     else{
	    	int c= a/b;
	    	 System.out.println("division is:"+c);
	     }
	
		//Write the exception msg here. 	
		} 
	public static void main(String[] args) { 		
		//Use keyword input here 
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First Number:  ");
		int a=s.nextInt();
		System.out.println("Enter Second Number:  ");
		int b=s.nextInt();
		try{
			ScannerA sc=new ScannerA(); 
			sc.div(a, b);//Handle exception and print exception msg here 			
		}
		catch(InputValidException e)   {
			System.out.println("output is:"+e.getMessage());
		}
		} 
	}


