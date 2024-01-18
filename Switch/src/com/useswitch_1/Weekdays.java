package com.useswitch_1;
import java.util.Scanner;

public class Weekdays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		//int b=sc.nextInt();
		//String a=sc.next();
		
		int a=sc.nextInt();
		switch(a){
		case  1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("tuesday");
			break;
			
		case 3:
			System.out.println("wednesday");
			break;
			
		case 4:
			System.out.println("thrusday");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Friday");
			break;
			
			default:
				System.out.println("sunday");		
		}
		
	}
}
