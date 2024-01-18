package com.starpattern;

public class A {
	public static void main(String[] args) {
		for (int i=0; i<=5;i++){//..0<=5...true...
			int j;
			for(j=0; j<=i; j++){// 0<=0...false
				System.out.print("*");
			}
			System.out.println();
		}
	}

	
}
