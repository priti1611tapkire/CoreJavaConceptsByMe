package com.cjc.calculator.client;
import java.util.Scanner;
//package com.cjc.calculator.service;
import com.cjc.calculator.service.*;
import com.cjc.calculator.serviceImpl.*;
import java.util.Scanner;
import com.cjc.calculator.service.*;
public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Operation a1=new Operation();
		while(true){
			System.out.println("Press 1 for Addition");
			System.out.println("Press 2 for substraction");
			System.out.println("Press 3 for multiplication");
			System.out.println("Press 4 for division");
			System.out.println("Press 5 for Default");
			System.out.println("Enter opertation do you want to perform");
			int op=sc.nextInt();
		System.out.println("Enter First Number:  ");
		int a=sc.nextInt();
		System.out.println("Enter Second Number:  ");
		int b=sc.nextInt();
		
		
		
		switch(op){
		case 1:
			
			int c=a1.add(a, b);
			System.out.println("Addition of a & b:  "+c);
			break;
			
		case 2:
			
			int e=a1.sub(a, b);
			System.out.println("substraction of a & b:  "+e);
			break;
			
		case 3:
			
			int f=a1.mul(a, b);
			System.out.println("multiplication of a & b:  "+f);
			break;
			
		case 4:
			
			int h=a1.div(a, b);
			System.out.println("division of a & b:  "+h);
			break;
			
			
			default:
				System.out.println("Thank you");
				exit(true);
				//exit_loop: ;
				
		}
		}	
	}

	private static void exit(boolean b) {
	/// TODO Auto-generated method stub
		
	}

}
