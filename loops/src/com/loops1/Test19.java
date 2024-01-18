package com.loops1;
import java.util.Scanner;
//sum of first & last digit number
public class Test19 {
	public static void main(String[] args) {
		int a, m, n, temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number:   ");
		a =sc.nextInt();
		 m= a;
		while(m>=10){
			
			m=m/10;
		}
		n=a%10;
		
		System.out.println("\n  first digit of given number " +a+"= "+m);
		
		System.out.println("\n  first digit of given number " +a+"= "+n);
			temp=m+n;
		System.out.println("Addition of is =  "+temp);
	}

}
