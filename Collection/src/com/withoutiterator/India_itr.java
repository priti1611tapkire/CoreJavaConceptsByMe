package com.withoutiterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class India_itr {
	public static void main(String[] args) {
		List<String> mh=new ArrayList<>();
		mh.add("Pune");
		mh.add("Mumbai");
		mh.add("Nagpur");
		
		List<String> jh=new ArrayList<>();
		jh.add("Ranchi");
		jh.add("Jamshedpur");
		//jh.add("pune");
		
		Set<List<String>>india=new HashSet<>();
		india.add(mh);
		india.add(jh);
		
		Iterator<List<String>> itr=india.iterator();
		while(itr.hasNext()){//   // mh, jh                             true
			List<String> state=(List)itr.next();
			Iterator<String> itr1=state.iterator();//              mh,                                jh
			while(itr1.hasNext()){// true..................................true..............false
				String city=itr1.next();// 1)pune, 2)Mumbai, 3)Nagpur   1)ranchi, 2)jamshedpur
				System.out.println(city);// pune, mumbai, nagpur                 ranchi jamshedpur
			}
		
		}
	}

}
