package com.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
//import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class India_listset {
	public static void main(String[] args) {
		List mh=new ArrayList();
		mh.add("Pune");
		mh.add("Mumbai");
		mh.add("Nagpur");
		
		List jh=new ArrayList();
		jh.add("Ranchi");
		jh.add("Jamshedpur");
		//jh.add("pune");
		
		Set india=new HashSet();
		india.add(mh);
		india.add(jh);
		
		Iterator itr=india.iterator();
		while(itr.hasNext()){//   // mh, jh                             true
			List s=(List)itr.next();
			Iterator itr1=s.iterator();//              mh,                                jh
			while(itr1.hasNext()){// true..................................true..............false
				String val=(String)itr1.next();// 1)pune, 2)Mumbai, 3)Nagpur   1)ranchi, 2)jamshedpur
				System.out.println(val);// pune, mumbai, nagpur                 ranchi jamshedpur
			}
		
		}
	}
}
