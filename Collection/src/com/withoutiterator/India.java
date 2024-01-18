package com.withoutiterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class India {

		public static void main(String[] args) {
			Set<String> mh=new HashSet<>();
			mh.add("Pune");
			mh.add("Mumbai");
			mh.add("Nagpur");
			
			Set<String> jh=new HashSet<>();
			jh.add("Ranchi");
			jh.add("Jamshedpur");
			
			
			Set<Set<String>> india=new HashSet<>();
			india.add(mh);
			india.add(jh);
			
			Iterator<Set<String>> itr=india.iterator();// mh, jh
			while(itr.hasNext()){//                                true
				Set<String> state=itr.next();
				
				Iterator<String> itr1=state.iterator();//              mh,                                jh
				while(itr1.hasNext()){// true..................................true..............false
					String city=itr1.next();// 1)pune, 2)Mumbai, 3)Nagpur   1)ranchi, 2)jamshedpur
					System.out.println(city);// pune, mumbai, nagpur                 ranchi jamshedpur
				}
			
			}
		}
	}


