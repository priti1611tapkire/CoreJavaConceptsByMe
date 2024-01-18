package com.set;


import java.util.HashSet;
import java.util.Iterator;

import java.util.Set;

public class Test_India {
	public static void main(String[] args) {
		Set mh=new HashSet();
		mh.add("Pune");
		mh.add("Mumbai");
		mh.add("Nagpur");
		
		Set jh=new HashSet();
		jh.add("Ranchi");
		jh.add("Jamshedpur");
		//jh.add("pune");
		
		Set india=new HashSet();
		india.add(mh);
		india.add(jh);
		
		Iterator itr=india.iterator();// mh, jh
		while(itr.hasNext()){//                                true
			Set s=(Set)itr.next();
			
			Iterator itr1=s.iterator();//              mh,                                jh
			while(itr1.hasNext()){// true..................................true..............false
				String val=(String)itr1.next();// 1)pune, 2)Mumbai, 3)Nagpur   1)ranchi, 2)jamshedpur
				System.out.println(val);// pune, mumbai, nagpur                 ranchi jamshedpur
			}
		
		}
	}
}


