package com.country;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Country2 {
	public static void main(String[] args) {
		
		List<String> mh=new ArrayList<>();
		mh.add("Pune");
		mh.add("Nagpur");
		
		List<String> jh=new ArrayList<>();
		jh.add("Ranchi");
		jh.add("Janshedpur");

		List<List<String>> india=new ArrayList<>();
		india.add(mh);
		india.add(jh);
		
		List<String> ny=new ArrayList<>();
		ny.add("Fredonia");
		ny.add("Dunkirk");

		List <String>california=new ArrayList<>();
		california.add("Redwood city");
		california.add("San Diego");
		
		List<List<String>> us=new ArrayList<>();
		us.add(ny);
		us.add(california);
		
		List<List<List<String>>> world=new ArrayList<>();
		world.add(india);
		world.add(us);
		
		 Iterator<List<List<String>>> itr=world.iterator();
		 while(itr.hasNext()){
			List<List<String>>count=itr.next();
			  Iterator<List<String>> itr1=count.iterator();
			  while(itr1.hasNext()){
				  List<String>state=itr1.next();
				  Iterator<String> itr2=state.iterator();
				  while(itr2.hasNext()){
					  String city=itr2.next();
					  System.out.println(city);
				  }
			  }
		 }	 
	}
}
