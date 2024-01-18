package com.map;


import java.util.*;

public class A19 {
	public static void main(String[] args) {
		Set s=new HashSet();
		s.add("Priti");

		Map m=new HashMap();
		m.put(1, s);

		Map m1=new HashMap();
		m1.put(1, m);

		Set keys=m1.keySet();
		Iterator itr=keys.iterator();
		while(itr.hasNext()){
			int key=(int) itr.next();
			Map m2=(Map) m1.get(key);
			Set s1=(Set)m2.keySet();
			Iterator itr1=keys.iterator();
			while(itr1.hasNext()){
				int i =(int) itr1.next();
				Set s2=(Set)m2.get(i);

				Iterator itr2=s2.iterator();
				while(itr2.hasNext()){
					String val=(String)itr2.next();
					System.out.println(val);
				}
			}


		}
	}
}
