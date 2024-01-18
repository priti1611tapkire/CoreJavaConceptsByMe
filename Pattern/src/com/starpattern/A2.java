package com.starpattern;

public class A2 {
	public static void main(String[] args) {
		int i;
		for(i=0; i<5;i++)
		{
			int j;
			for(j=i-1; j>1;j--){
				System.out.print(" ");
			}
			int k;
			for(k=0;k<=5-i;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
 