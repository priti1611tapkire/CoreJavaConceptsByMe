package com.starpattern;
//5
public class A6 {
	public static void main(String[] args) {
		int i;
		for(i=0;i<5;i++){
			int j;
			for(j=5-i;j>1;j--){
				System.out.print(" ");
			}
			int k;
			for(k=0;k<=i;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
