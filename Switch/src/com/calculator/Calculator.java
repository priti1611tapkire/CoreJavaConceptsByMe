package com.calculator;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int a, b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:  ");
		int a1=sc.nextInt();
		System.out.println("Enter Second Number:  ");
		int b1=sc.nextInt();
		System.out.println("Enter opertation do you want to perform");
		int op=sc.nextInt();
		
		switch(op){
		case 1:
			int c=a1+b1;
			System.out.println("Addition of a & b:  "+c);
			break;
			
		case 2:
			
			int e=a1-b1;
			System.out.println("substraction of a & b:  "+e);
			break;
			
		case 3:
			
			int f=a1*b1;
			System.out.println("multiplication of a & b:  "+f);
			break;
			
		case 4:
			
			int h=a1/b1;
			System.out.println("division of a & b:  "+h);
			break;
			
			
			default:
				System.out.println("Thank you");
			break;		
		}
	}

}
