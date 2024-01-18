package com.map;

import java.util.*;

public class A21 {
	public static void main(String[] args) {
		Map m=new HashMap();
		m.put("aa", "abc");
		m.put("bb", "pqr");
		m.put("cc", "xyz");

		Set<String> keys=m.keySet();
		Iterator itr=keys.iterator();
		while(itr.hasNext()){
			String key=(String)itr.next();
			System.out.println(key);
			String val=(String)m.get(key);		
			System.out.println(val);
		}
	}


}
