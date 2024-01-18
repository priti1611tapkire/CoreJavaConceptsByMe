package com.scanner_5;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:  ");
		int m=sc.nextInt();
		System.out.println("Enter Second Number:  ");
		int n=sc.nextInt();
		A a1=new A();
		int e=a1.add(m , n);
		System.out.println(e);
		
		System.out.println("Enter First Number:  ");
		int a=sc.nextInt();
		System.out.println("Enter Second Number:  ");
		int b=sc.nextInt();
		A a2=new A();
		int f=a2.sub(a , b);
		System.out.println(f);
		
		System.out.println("Enter First Number:  ");
		int x=sc.nextInt();
		System.out.println("Enter Second Number:  ");
		int y=sc.nextInt();
		A a3=new A();
		int g=a3.mul(x , y);
		System.out.println(g);
		
		System.out.println("Enter First Number:  ");
		int p=sc.nextInt();
		System.out.println("Enter Second Number:  ");
		int q=sc.nextInt();
		A a4=new A();
		int h=a4.div(p , q);
		System.out.println(h);
		
	}
}
