package com.scanner_1;
import java.util.Scanner;


public class A {
	Scanner sc =new Scanner(System.in);
	public void add(){
		System.out.println("Enter First Number:  ");
		int a=sc.nextInt();
		System.out.println("Enter Second Number: ");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Addition of a & b:  "+c);
	}
	public static void main(String[] args) {
		A a=new A();
		a.add();
	}

}
