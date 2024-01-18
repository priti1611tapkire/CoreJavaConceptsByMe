package com.map;

import java.util.*;

public class A17 {
	public static void main(String[] args) {
		Map m1=new HashMap();
		m1.put(1, 25);
		m1.put(2, 50);
		
		Map m2=new HashMap();
		m2.put(1, 25);
		m2.put(2, 50);
		
		Map m=new HashMap();
		m.put(25, m1);
		m.put(12, m2);
		
		Set<Integer> keys=m.keySet();
		Iterator itr=keys.iterator();
		while(itr.hasNext()){
			int key1=(int)itr.next();
			System.out.println(key1);
			//int val=(int) m.get(key);
			Set val=(Set)m.get(key1);
			Iterator itr1=val.iterator();
			while(itr1.hasNext()){
				int i=(int)itr1.next();
				System.out.println(i);
			}
		}	
	}
}
