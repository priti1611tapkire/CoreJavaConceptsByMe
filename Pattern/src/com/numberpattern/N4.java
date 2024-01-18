package com.numberpattern;
//word 1
public class N4 {
	public static void main(String[] args) {
		    
	        for(int i=0; i<5; i++) // outer loop for rows...i=0<=5...true// i=1+1=2
	        { 
	          int n=1;
	            for(int j=0; j<=i; j++) // inner loop for rows// j=0<=0...true...j=2<=0...false...j=2<=2
	            { 
	                 
	                System.out.print(n); // 1
	                
	                n++;//=1+1=2
	                //1 , 2
	            } 
	            System.out.println(); //next line
	        } 
	}

}
