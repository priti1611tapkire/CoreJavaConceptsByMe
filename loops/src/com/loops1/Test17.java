package com.loops1;

public class Test17 {
public static void main(String[] args) {
	int num=150;
	int temp=num;
	int sum=0;
	while(num>0){//150>10...true
		int rem=num%10;// rem=150%10...0
		sum=sum*10 + rem;
		num=num/10;
		
	}
	//if(sum==temp){
	//	System.out.println("palindrome numbers:  ");
	//}
}
}
