package com.map;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Concuu {
	public static void main(String[] args) {
		ConcurrentHashMap< Integer, String> m=new ConcurrentHashMap<>();
		m.put(5, "ABC");
		m.put(12, "Xyz");
		m.put(16, "PQR");
		System.out.println(m);

		m.put(12, "Seeta");

		Set<Integer> s=m.keySet();

		for(int key:s){
			System.out.println(key);
			String s1=m.get(key);
			System.out.println(s1);
		}
	}

}
