package com.map;

import java.util.HashMap;
import java.util.Set;

public class Hashmam {
	public static void main(String[] args) {
		HashMap<Integer , String> m=new HashMap<>();
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
