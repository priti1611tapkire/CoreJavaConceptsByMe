package com.superthis_4;

public class Animal {
	int i=51;
	public Animal(int j){ // 3. j=26
		System.out.println(i); // 4. 51
		this.i=j*10; //  5. 26*10=260
	}
}
