package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A {
	public static void main(String[] args) {
		 Map m=new HashMap(); 
		 m.put(5, "ABC"); //key,value
		 m.put(10, "Xyz");
		 m.put(20, "PQR");
		 
		// System.out.println(m);
		 Set<Integer>keys=m.keySet(); 
		 /*
		 for(int key:keys){  
			 System.out.println(key); //5  10
			 String val=(String)m.get(key);  //ABC
			 System.out.println(val);}*/   //ABC
		Iterator<Integer>itr=keys.iterator();//
		 while(itr.hasNext())// true true true false
		 {
			 int key=(int)itr.next(); //5   10   20
			 System.out.println((key)); //5 10
			 String val=(String)m.get(key);  //ABC   Xyz    PQR
			 System.out.println(val); //ABC Xyz
		 }
		 
		 
	}

}
