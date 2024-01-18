package com.map;
import java.util.*;
public class A23 {
public static void main(String[] args) {
	Map m=new HashMap();
	m.put(1.1d, "abc");
	m.put(2.2d, "pqr");
	m.put(3.3d, "xyz");
	
	Set<Double> keys=m.keySet();
	Iterator itr=keys.iterator();
	while(itr.hasNext()){
		Double key=(Double)itr.next();
		String val=(String)m.get(key);
		System.out.println(val);
	}
}
}
