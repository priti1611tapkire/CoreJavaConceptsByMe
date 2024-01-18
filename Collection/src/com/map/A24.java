package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A24 {
	public static void main(String[] args) {
	Map<Double, String> m=new HashMap<>();
	m.put(1.1d, "abc");
	m.put(2.2d, "pqr");
	m.put(3.3d, "xyz");
	
	Set<Double> keys=m.keySet();
	Iterator<Double> itr=keys.iterator();
	while(itr.hasNext()){
		Double key=itr.next();
		System.out.println(key);
		String val=m.get(key);
		System.out.println(val);
	}
	System.out.println("---------------------------");
	for(Double key:keys){
		System.out.println(key);
		String val=m.get(key);
		System.out.println(val);
	}
	}
}
