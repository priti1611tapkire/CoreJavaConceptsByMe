package com.scanner_4;

import java.util.Scanner;

public class A {
	Scanner sc=new Scanner(System.in);
	public int add(){
		System.out.println("Enter First Number:  ");
		int a=sc.nextInt();
		System.out.println("Enter Second Number:  ");
		int b=sc.nextInt();
		
		int c=a+b;
		return c;
	}

	public int sub(){
		System.out.println("Enter First Number:  ");
		int p=sc.nextInt();
		System.out.println("Enter Second Number:  ");
		int q=sc.nextInt();
		
		int r=p-q;
		return r;
	
	}
	public int mul(){
		System.out.println("Enter First Number:  ");
		int x=sc.nextInt();
		System.out.println("Enter Second Number:  ");
		int y=sc.nextInt();
		
		int z=x*y;
		return z;
		
	}
	public int div(){
		System.out.println("Enter First Number:  ");
		int m=sc.nextInt();
		System.out.println("Enter Second Number:  ");
		int n=sc.nextInt();
		
		int o=m/n;
		return o;
		
	}


}
