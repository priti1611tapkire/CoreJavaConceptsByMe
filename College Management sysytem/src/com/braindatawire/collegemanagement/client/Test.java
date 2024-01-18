package com.braindatawire.collegemanagement.client;

import java.util.Scanner;

import com.braindatawire.collegemanagement.service.Cjc;
import com.braindatawire.collegemanagement.serviceImpl.Karvenagar;

public class Test {
public static void main(String[] args) {
	
	Cjc k=new Karvenagar();
	Scanner sc=new Scanner(System.in);
	while(true){
		
		System.out.println("Enter 1 to Add Course");
		System.out.println("Enter 2 to view Course");
		System.out.println("Enter 3 to add Faculty");
		System.out.println("Enter 4 for view Faculty");
		System.out.println("Enter 5 for add batch");
		System.out.println("Enter 6 to view batch");
		System.out.println("Enter 7 for add Student");
		System.out.println("Enter 8 to view Student");
		System.out.println("Enter 9 for Exit");
		System.out.println("Enter Choice No do you want to perform");
		
		int op=sc.nextInt();	
		switch(op){
		case 1:
			k.addCourse();
			break;
			
		case 2:
			k.viewCourse();
			break;
			
		case 3:
			k.addFaculty();
			break;
			
		case 4:
			k.viewFaculty();
			break;
			
		case 5:
			k.addBatch();
			break;
			
		case 6:
			k.viewBatch();
			break;
			
		case 7:
			k.addStudent();
			break;
			
		case 8:
			k.viewStudent();
			break;

		case 9: 
			//System.out.println("------WELCOME TO CJC------");
		 System.exit(0);
		 
		 default:
			 System.out.println("Thank you");
		}
		}
	
}
}
