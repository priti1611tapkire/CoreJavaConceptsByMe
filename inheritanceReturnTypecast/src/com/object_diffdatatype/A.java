package com.object_diffdatatype;

public class A {
 public static void main(String[] args) {
	 //create double type variable
	double num= 10.99d;
	System.out.println("The double value: " +num);
	//conversion
	int data =(int)num;
	long data1=(long)num;
	float data2=(float)num;
	
	System.out.println("The integer value: " + data);
	System.out.println("The long value: " + data1);
	System.out.println("The float value: " + data2);
	
 	}
}
