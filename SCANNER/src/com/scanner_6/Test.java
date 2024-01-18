package com.scanner_6;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student a=new Student();
		
		int rollno=sc.nextInt();
		String name=sc.next();
		String address=sc.next();
		//a.setRollno(sc.nextInt());
		//a.setName(sc.next());
		//a.setAddress(sc.next());
		System.out.println("Roll no of the student:   ");
		System.out.println(a.getRollno());
	
		System.out.println("Name of the student:   ");
		System.out.println(a.getName());
		
		System.out.println("Address of the student:   ");
		System.out.println(a.getAddress());
	}

}
