package com.cset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Country2 {
public static void main(String[] args) {
		
		Set<String> mh=new HashSet<>();
		mh.add("Pune");
		mh.add("Nagpur");
		
		Set<String> jh=new HashSet<>();
		jh.add("Ranchi");
		jh.add("Janshedpur");

		Set<Set<String>> india=new HashSet<>();
		india.add(mh);
		india.add(jh);
		
		Set<String> ny=new HashSet<>();
		ny.add("Fredonia");
		ny.add("Dunkirk");

		Set <String>california=new HashSet<>();
		california.add("Redwood city");
		california.add("San Diego");
		
		Set<Set<String>> us=new HashSet<>();
		us.add(ny);
		us.add(california);
		
		Set<Set<Set<String>>> world=new HashSet<>();
		world.add(india);
		world.add(us);
		
		 Iterator<Set<Set<String>>> itr=world.iterator();
		 while(itr.hasNext()){
			 Set<Set<String>>count=itr.next();
			  Iterator<Set<String>> itr1=count.iterator();
			  while(itr1.hasNext()){
				  Set<String>state=itr1.next();
				  Iterator<String> itr2=state.iterator();
				  while(itr2.hasNext()){
					  String city=itr2.next();
					  System.out.println(city);
				  }
			  }
		 }
		 
	}

}
