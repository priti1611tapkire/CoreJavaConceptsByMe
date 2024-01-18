package com.loops1;

public class Digitcount1 {
	public static void main(String[] args) {
		int val=58972234;
		int count=0;
		while(val>0){
			int rem=val&10;//...
			count++;
			val=val/10;
			
		}
		System.out.println(count);
	}

}
