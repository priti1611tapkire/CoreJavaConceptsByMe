package com.loops1;
// if else if(Ladder)
public class Test3 {
	public static void main(String[] args) {
	int x=50;
	int y=20;
	
	if(x<y){// 50<20...false then it will directly going toward else if statement
		System.out.println("x::   "+x);
	}
	else if (x>y){// 50>20....true
		System.out.println("Yes, "+x+" is greater than "+y);
	}
	else if(y<x || y!=x){// or oprator in this condition atleast 1 condition is must be right
		System.out.println("Y is less than: "+x);
		
	}
	else{
		System.out.println("both are equal");
	}
}
}
