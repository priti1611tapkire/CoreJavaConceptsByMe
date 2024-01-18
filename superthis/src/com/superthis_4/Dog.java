package com.superthis_4;

public class Dog extends Animal {
	public Dog (int j){ // 1.j=26
		super(j); // 2. super(26)
		System.out.println(i); // 6.51
		this.i=j*20; //7. 26*20=520
	}
	public static void main(String[] args) {
		Dog d = new Dog (26);         		
		System.out.println(d.i);       
	}
}
