package com.scanner_3;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:  ");
		int m=sc.nextInt();
		System.out.println("Enter Second Number:  ");
		int n=sc.nextInt();
		A a1=new A();
		a1.add(m, n);
		
		
	System.out.println("Enter First Number:  ");
	int a=sc.nextInt();
	System.out.println("Enter Second Number:  ");
	int b=sc.nextInt();
	A a2=new A();
	a2.sub(a, b);
	
	System.out.println("Enter First Number:  ");
	int x=sc.nextInt();
	System.out.println("Enter Second Number:  ");
	int y=sc.nextInt();
	A a3=new A();
	a3.mul(x, y);
	
	System.out.println("Enter First Number:  ");
	int p=sc.nextInt();
	System.out.println("Enter Second Number:  ");
	int q=sc.nextInt();
	A a4=new A();
	a4.div(p, q);
	}
	
}
