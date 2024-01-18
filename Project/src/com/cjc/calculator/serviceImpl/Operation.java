package com.cjc.calculator.serviceImpl;
//import java.util.Scanner;
import com.cjc.calculator.client.*;
import com.cjc.calculator.service.*;



public class Operation implements Calculator  {
	
	public int add(int a, int b){
		int c=a+b;
		return c;
		//System.out.println("Addition of m & n:  "+o);
		
	  }
	public int sub(int a, int b){
		
		int c=a-b;
		return c;
	//	System.out.println("Substarction of a & b:  "+c);
	}
	public int mul(int a, int b){
		
		int c=a*b;
		return c;
		//System.out.println("Multiplication of x & y:  "+c);
	}
	public int div(int a, int b){
		
		int c=a/b;
		return c;
		//System.out.println("Divison of p & q:  "+r);
	}
} 
