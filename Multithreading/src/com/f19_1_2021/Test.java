package com.f19_1_2021;

public class Test {
	public static void main(String[] args) {
		NumberG odd=new NumberG(1, 100);
		NumberG even=new NumberG(2, 100);
//		NumberG add=new NumberG(1, 100);
//		NumberG add1=new NumberG(2, 100);
//		add.display();
//		add1.display();
		odd.setName("odd");
		even.setName("even");
		odd.start();
		even.start();
	}
}
