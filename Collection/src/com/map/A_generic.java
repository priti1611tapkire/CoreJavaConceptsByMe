package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A_generic {
	public static void main(String[] args) {
		 Map<Integer, String> m=new HashMap<>();
		 m.put(5, "ABC");
		 m.put(12, "Xyz");
		 m.put(16, "PQR");
		 
		
		 Set<Integer>keys=m.keySet();
		 /*
		 for(int key:keys){
			 System.out.println(key);
			 String val=m.get(key);
			 System.out.println(val);}*/
		Iterator<Integer>itr=keys.iterator();//
		 while(itr.hasNext())//
		 {
			 int key=itr.next();
			 System.out.println((key));
			 String val=m.get(key);
			 System.out.println(val);
		 }
	}

}