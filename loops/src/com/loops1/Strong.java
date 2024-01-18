package com.loops1;

public class Strong {
	//WAP to check given number is a Strong Number eg:145
	  //[Hint: Factorial of all digits and its addition=given no]
	//[Hint:  145->1! +4! +5! = 1+24+120 = 145] */

	
	public static void main(String args[]){
	int fact, sum =0, number = 145;//values override 
	int temp = number;//145 fix
	while(number!=0){// 145!=0...true....///while loop use for remender 
	fact=1;
	int rem=number%10;   //145%10...rem=5
	for(int i=rem;i>=1;i--){//...i=5; 5>=1...true...i=5-1=4 4>=1 i=4-1=3
	fact=fact*i;// =1*5=5...=5*4=20....20*3=60...
	}
	sum=sum+fact; 
	number=number/10;
	}
	if(sum==temp){
	System.out.println("Strong num")

	;
	}
	else{
	System.out.println("No Strong num");
	}
	}
}
