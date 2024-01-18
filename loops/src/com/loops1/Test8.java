package com.loops1;

public class Test8 {
	public static void main(String[] args) {
		int age=15;
		int a=18;
		
		if(age>a){// 15>18...false
			System.out.println("No, the candidate is eligible for voting");
		}
		
		else if(age!=a||age<a ){// 15!=18...false || 15<18....true
			System.out.println("No, the candidate is not eligible for voting");
			
		}
		else{
			System.out.println("else not suit in parameter");
		}
		
	}

}
