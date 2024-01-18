package com.loops1;
//if else if (ladder)
public class Test6 {
	public static void main(String[] args) {
		int num1=1;
		int num2=2;
		int num3=3;

		if(num2>num3){// 2>3...false
			System.out.println("yes, "+num2+"  is greater than: " +num3);
		}
		
		else if(num1>num2){// 1>2...false
			System.out.println("Yes, "+num1+" is greater than: " +num2);
		}
		else{
			System.out.println("yes, "+num3+" is greatest number among the all 3 numbers");
		}
	}

}
