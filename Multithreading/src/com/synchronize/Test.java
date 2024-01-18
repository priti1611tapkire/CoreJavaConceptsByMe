package com.synchronize;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class Test {
	public static void main(String[] args) {
		Hello h=new Hello();
		
		A t1=new A("java", h);
		A t2=new A("Classes", h);
		t1.start();
		t2.start();
		
		Hello h1=new Hello();
		
		A t3=new A("python", h1);
		A t4=new A("Cjc", h1);
		t3.start();
		t4.start();
		Executor
		
	
	}

}
