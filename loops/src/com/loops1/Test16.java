package com.loops1;
import java.util.Scanner;

public class Test16 {
public static void main(String[] args) {
	int sum=0, m, n;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	m=s.nextInt();
	while(m>0){// 23456789>0...true
		n=m%10;// 23456789%10...9
		sum=sum+n;//....sum=0+9=9
		m=m/10;//....
		
	}
	System.out.println("Sum of digits: "+sum);
}
}
