package com.exceptioncheck;

public class Test1 {
	public static void main(String[] args) {
		A a=null;
		System.out.println("main__________start");//1
		try{
			System.out.println("Try------------start"); //2
			System.out.println(a.toString());
			System.out.println("Try--------------End");
		}
		catch(NullPointerException e){
			System.out.println("catch block");//3
		}
		System.out.println("main___________end");//4
		}


}
