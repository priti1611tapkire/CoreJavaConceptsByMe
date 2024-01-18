package com.multipletrycatch;

public class Test {
	public static void main(String[] args) {
		System.out.println("main start");
		try{
			System.out.println("try---start");
			String s=args[0];
			int x=Integer.parseInt(s);
			int a=10/x;
	    	}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Enter input value--");
		}
		catch(NumberFormatException e){
			System.out.println("Enter Number--");
			}
		catch(ArithmeticException e){
			System.out.println("Enter Non-zero value");
		}

	
	}

}
