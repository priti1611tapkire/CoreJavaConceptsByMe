package com.starpattern;

public class A3 {
	public static void main(String[] args) {
		int i;
		for(i=1; i<6;i++)//0<6...true
		{
			int j;
			for(j=5; j>=5;j--){//...5>=5...true..space...j=5-1=4>=5
				System.out.print(" ");
			}
			int k;
			for(k=1;k<=6-i;k++){// 
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}