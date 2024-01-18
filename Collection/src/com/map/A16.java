package com.map;

import java.util.*;

public class A16 {
	public static void main(String[] args) {
		Set<Integer> s=new HashSet<>();
		s.add(12);
		s.add(16);
		s.add(20);

		Set<Integer> s1=new HashSet<>();
		s1.add(52);
		s1.add(86);
		s1.add(95);

		Map<Integer, Set<Integer>> m=new HashMap<>();
		m.put(1, s);
		m.put(2, s1);

		Set<Integer> keys=m.keySet();
		Iterator<Integer> itr=keys.iterator();
		while(itr.hasNext()){
			int key=itr.next();
			System.out.println(key);
			Set<Integer> val=m.get(key);
			Iterator<Integer> itr1=val.iterator();
			while(itr1.hasNext()){
				int i=itr1.next();
				System.out.println(i);

			}
		}
		System.out.println("===========================");
		for(Integer key:keys){
			System.out.println(key);
			Set<Integer> val=m.get(key);
			for(int i :val){
				System.out.println(i);

			}
		}
	}
}
