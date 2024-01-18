package com.numberpattern;
// 6 pending
public class N6 {
	public static void main(String[] args) {
	    
		 for(int i=1; i<=5; i++) // outer loop for rows //i=1+1=2...true
	       { 
	            for(int j=1; j<=i; j++) // inner loop for col//  j=1<=2...true
	            { 
	                System.out.print(j); // j=1+1=2 
	                // 1 2
	                //
	                
	            } 
	            for(int k=i; k<5; k++){
	            	System.out.print("*");
	            }
	            System.out.println(); 
	       }
}
}
//i=1<5 true -> j=1<=1...true print 1 k=i=1<5...true...k=