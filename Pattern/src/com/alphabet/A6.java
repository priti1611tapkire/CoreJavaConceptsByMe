package com.alphabet;
//2
public class A6 {
	public static void main(String[] args) {
		char i;
		for ( i ='A'; i<='E'; i++) { // A<=E...true...i=A+1=B<=E...true
			for (char j='A'; j <= i; j++)// A<=A...true ....j=A+1=B<=A...False next line
				// j=B>=A...true...j j=B+1=C...false
				//
		   {
		       System.out.print(i);// A
		       // B 
		   }
		   System.out.println();//next line
		}         
		}
}
	


