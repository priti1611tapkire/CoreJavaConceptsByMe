package com.narrowing_3;

public class Test {
	public void m1(A a){
		System.out.println("in A parameter");
	}
	public void m1(B b){
		System.out.println("in B parameter");
	}
	public void m1(C c){
		System.out.println("in C parameter");
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.m1(null);
		t.m1((A)null);
		t.m1((B)null);
	}

}
