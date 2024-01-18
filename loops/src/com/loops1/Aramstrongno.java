package com.loops1;

public class Aramstrongno {
	public static void main(String args[]){
		int num = 153;   
		int rem,c=0,temp;
		temp = num;

		while(num>0){//27>0...true....8>0
		rem = num%10;//153%10.....3.....27%10....7....8%10...
		num=num/10; //153/10.......15.....27/10.....2
		c=c+(rem*rem*rem);///0+(3*3*3)=27>......0+(2*2*2)=8
		}
		if(temp==c){
		System.out.println("armstrong no");
		}
		else{
		System.out.println("Not armstrong no");
		}
		}
}


