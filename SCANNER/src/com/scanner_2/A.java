package com.scanner_2;
import java.util.Scanner;


public class A {
	Scanner sc=new Scanner(System.in);
	public void sub(){
		System.out.println("Enter First Number:  ");
		int a=sc.nextInt();
		System.out.println("Enter Second Number:  ");
		int b=sc.nextInt();
		
		int c=a-b;
		System.out.println("Substarcton of a & b:  "+c);
	}
	public void mul(){
		System.out.println("Enter First Number:  ");
		int x=sc.nextInt();
		System.out.println("Enter Second Number:  ");
		int y=sc.nextInt();
		
		int z=x*y;
		System.out.println("Multiplication of x & y:  "+z);
	}
	public void div(){
		System.out.println("Enter First Number:  ");
		int p=sc.nextInt();
		System.out.println("Enter Second Number:  ");
		int q=sc.nextInt();
		
		int r=p/q;
		System.out.println("Divison of p & q:  "+r);
	}
	public static void main(String[] args) {
		A a=new A();
		a.sub();
		a.mul();
		a.div();
		
	}
	
}
