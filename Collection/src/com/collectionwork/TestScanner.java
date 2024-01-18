package com.collectionwork;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.*;
// Write the program to give the String input from keyboard and add into the list, retrieve using iterator.

public class TestScanner {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String:  ");
		int s1=s.nextInt();
		List list=new ArrayList();
		//list.add(s1);
		//list.add(sc.next());
		for(int i=0; i<s1;i++ ){
			//String s3=sc.next();
			//list.add(s3);
		}
		
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			String s2=(String)itr.next();
			System.out.println(s2);
		}
		
		
		
	}

}
