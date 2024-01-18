package com.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A20 {
	public static void main(String[] args) {
		Set<String>s=new HashSet<>();
		s.add("Priti");

		Map<Integer, Set<String>> m=new HashMap<>();
		m.put(1, s);

		Map<Integer, Map<Integer, Set<String>>> m1=new HashMap<>();
		m1.put(1, m);

		Set<Integer> keys=m1.keySet();
		Iterator<Integer> itr=keys.iterator();
		while(itr.hasNext()){
			int key= itr.next();
			Map<Integer,Set<String> > val= m1.get(key);
			Set<Integer> keys1=val.keySet();
			Iterator<Integer> itr1=keys1.iterator();
			while(itr1.hasNext()){
				int i = itr1.next();
				Set<String> keys2=val.get(i);
				System.out.println(keys2);
				Iterator<String> itr2=keys2.iterator();
				while(itr2.hasNext()){
					String val1=itr2.next();
					System.out.println(val1);
				}
			}
		}
	}
}
