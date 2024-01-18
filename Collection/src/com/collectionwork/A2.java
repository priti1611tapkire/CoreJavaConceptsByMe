package com.collectionwork;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class A2 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("PR");
		list.add("abc");
		list.add("PQR");
		list.add("MNP");
		list.add("pqr");
		list.add("TUV");
		
		Iterator itr=list.iterator();
		System.out.println(itr.hasNext());
		String f1=(String)itr.next();
		System.out.println(f1);
		
		System.out.println(itr.hasNext());
		String f2=(String)itr.next();
		System.out.println(f2);
		
		System.out.println(itr.hasNext());
		String f3=(String)itr.next();
		System.out.println(f3);
		
		
		System.out.println(itr.hasNext());
		String f4=(String)itr.next();
		System.out.println(f4);
		
		System.out.println(itr.hasNext());
		String f5=(String)itr.next();
		System.out.println(f5);
		
		System.out.println(itr.hasNext());
		String f6=(String)itr.next();
		System.out.println(f6);
		
	/*	String s=(String)list.get(0);
		System.out.println(s);
		
		String s1=(String)list.get(1);
		System.out.println(s1);
		
		String s2=(String)list.get(2);
		System.out.println(s2);
		
		String s3=(String)list.get(3);
		System.out.println(s3);
		
		String s4=(String)list.get(4);
		System.out.println(s4);
		
		String s5=(String)list.get(5);
		System.out.println(s5);    */
		
		
		/*Iterator itr=list.iterator();
		while(itr.hasNext()){
			String x=(String)itr.next();
			System.out.println(x); */
		}
	}


