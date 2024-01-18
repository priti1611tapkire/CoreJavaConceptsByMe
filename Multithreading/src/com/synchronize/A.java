package com.synchronize;

public class A extends Thread{
	
	private String msg;
	private Hello h;
	
	public A(String msg, Hello h){
		this.msg=msg;
		this.h=h;
		
	}
	public void run(){
		h.display(msg);
	}
	
}
