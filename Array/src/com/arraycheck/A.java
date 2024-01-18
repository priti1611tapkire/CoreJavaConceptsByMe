package com.arraycheck;

public class A {
	int[] a={10,20,30};//new int[3];
	
	public void m1(){	
		a[0]=10;
		a[1]=20;
		a[2]=30;
	//	a[3]=40;
		//System.out.println(a[0]);
	//	System.out.println(a[1]);
	//	System.out.println(a[2]);
		//System.out.println(a[3]);
	}
	
	public void m2(){
		a[0]=10;
		a[1]=20;
		a[2]=30;
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
	 A a1=new A();
	 a1.m2();
	}

}
