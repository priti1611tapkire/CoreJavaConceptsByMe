package com.starpattern;
//6
public class A7 {
	public static void main(String[] args) {
		for(int i=0;i<=5-1;i++){
			for(int j=0;j<=i;j++){
				System.out.print(" ");
			}
			for(int k=0;k<=5-1-i;k++){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
