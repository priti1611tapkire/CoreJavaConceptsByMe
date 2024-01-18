package com.loops1;
import java.util.Scanner;

public class Test18 {
	public static void main(String[] args) {
		int n=1, b, N=150, num=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the palindrome no N: ");
		int N1=sc.nextInt();
		System.out.println("palindrome numbers from 1 to N:  ");
		for(int i=1; i<=N; i++){
			n=1;
			while(n>0){
				b=n%10;
				num=num*10 + b;
				n=n/10;
			}
			if (num==i){
				System.out.println(i + "  ");
			}
			num=0;
		}
		
		
		
		
		
		//int num=150, value1=0, rem, temp;
		//temp=num;
	//	while(num!=0){
			//rem=num%10;
			//value1=value1*(10+rem);
			//num /=10;
			
		//}
		//if(temp==value1 ){
		//	System.out.println(temp +"palindrome number");
		//}
	//	
	}

}
