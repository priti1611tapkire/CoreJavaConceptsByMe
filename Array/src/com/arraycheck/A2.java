package com.arraycheck;
//Add  this elements into the array  a, A ,b, F, m, q and retrieve from array
public class A2 {
	public static void main(String[] args) {
	char c[]=new char[6];
	c[0]='a';
	c[1]='A';
	c[2]='b';
	c[3]='F';
	c[4]='m';
	c[5]='q';
	
	/*	char c[]={'a','A','b','F','m','q'};
		 
		////System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		System.out.println(c[3]);
		System.out.println(c[4]);
		System.out.println(c[5]);  */
	for(char i='a';i<c.length;i++){
		System.out.println(c[i]);
	}
	}
}
 

