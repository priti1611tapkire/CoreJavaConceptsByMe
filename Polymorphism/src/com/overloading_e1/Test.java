package com.overloading_e1;

public class Test {
	public static void main(String[] args) {
		System.out.println("Normal main method");
		Test.main("cjc");
	}
	public static void main(String arg1){
		System.out.println("without array main method: "+arg1);
		Test.main("cjc","classes");
	}
	public static void main(String arg1, String arg2){
		System.out.println("two diffrent parameter main method:"+arg1+","+arg2);
		
	}
}
