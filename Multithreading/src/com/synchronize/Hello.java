package com.synchronize;

public class Hello {

	//synchronized public static void display(String msg){//class base lock
	//	synchronized public void display(String msg){//objectlevel lock
	public void display(String msg){
		//synchronized (this) {//lock on current object
			synchronized(Hello.class){//lock on class level
			System.out.println("[");
			System.out.println(msg);
			System.out.println("]");
		}
		
	}
}
