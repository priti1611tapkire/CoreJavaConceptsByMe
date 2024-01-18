package com.useswitch_1;
import java.util.Scanner;

public class Month {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		int b=sc.nextInt();
		//b=11;
		
		switch(b)
		{
		case 1:
			System.out.println("jan");
			break;
			
		case 2:
			System.out.println("Feb");
			break;
			
		case 3:
			System.out.println("march");
			break;
			
		case 4:
			System.out.println("april");
			break;
			
		case 5:
			System.out.println("may");
			break;
			
		case 6:
			System.out.println("june");
			break;
			
		case 7:
			System.out.println("july");
			break;
			
		case 8:
			System.out.println("Aug");
			break;
			
		case 9:
			System.out.println("sep");
			break;
			
		case 10:
			System.out.println("oct");
			break;
			
		case 11:
			System.out.println("nov");
			break;
			
		case 12:
			System.out.println("dec");
			break;
			
			default:
				System.out.println("12 months");
			
			
			
			
		}
		
		
	}

}
