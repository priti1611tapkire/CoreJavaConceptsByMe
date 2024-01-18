package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A18 {
	public static void main(String[] args) {
		Map<Integer, Integer> m1=new HashMap<>();
		m1.put(1, 25);
		m1.put(2, 50);
		
		Map <Integer, Integer>m2=new HashMap<>();
		m2.put(1, 25);
		m2.put(2, 50);
		
		Map<Integer, Map<Integer, Integer>> m=new HashMap<>();
		m.put(25, m1);
		m.put(12, m2);
		
		Set<Integer> keys=m.keySet();
		Iterator itr=keys.iterator();
		while(itr.hasNext()){
			int key=(int) itr.next();
			System.out.println(key);
			Map<Integer, Integer> val=m.get(key);
			Set<Integer> keys1=m.keySet();
			Iterator itr1=keys1.iterator();
			while(itr1.hasNext()){
				int i=(int)itr1.next();
				System.out.println(i);
				Map<Integer, Integer> i2=m.get(i);
				System.out.println(i2);
				
			}
		}
		System.out.println("---------------------------------------------------");
		 for(int i:keys){
			 System.out.println(i);
			 Map<Integer, Integer> val=m.get(i);
			 Set<Integer> keys1=m.keySet();
			 for(int i2:keys1){
				 Map<Integer, Integer> i3=m.get(i2);
				 System.out.println(i3);
				 
			 }
		 }
	}


}
