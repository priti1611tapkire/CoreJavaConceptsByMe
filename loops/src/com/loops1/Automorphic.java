package com.loops1;

public class Automorphic {
public static void main(String[] args) {
	int num=25, sqr, count=1, rem, temp=num;
	sqr=num*num;
	while(num>0){// (25>0)...true
		num=num/10;//...num=25/10...2>0....2/10...0
		count=count*10;//....count=1*10=10...count 10=10*10=100
		System.out.println(count);// 10
	}
	rem=sqr%count; //rem=25%10...5....625%100...25
	System.out.println(rem);//args.5
	
	if(rem==temp){//5==5....25=25...
		System.out.println(rem);
	}
	
}
}
