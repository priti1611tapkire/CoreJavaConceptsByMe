package com.map;


import java.util.*;

public class A22 {
	public static void main(String[] args) {
		Map<String, String> m=new HashMap<>();
		m.put("aa", "abc");
		m.put("bb", "pqr");
		m.put("cc", "xyz");
		
		Set<String> keys=m.keySet();
		Iterator<String> itr=keys.iterator();
		while(itr.hasNext()){
			String key=itr.next();
			System.out.println(key);
			String val=m.get(key);
			System.out.println(val);	
		}
		System.out.println("_-------------------");
	
	for(String key:keys){
		System.out.println(key);
		String val=m.get(key);
		System.out.println(val);
	}

}
}