package com.f19_1_2021;

public class NumberG extends Thread {
	int st;
	int end;
	public NumberG(int st, int end){
		this.st=st;
		this.end=end;

	}
	public void run(){
		for(int i=st;i<end;i++){
			System.out.println(i +" "+currentThread().getName());
			i=i+1;
		}
	}
}
