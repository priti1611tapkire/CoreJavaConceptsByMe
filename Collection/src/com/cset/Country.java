package com.cset;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Country {
	public static void main(String[] args) {
		
		Set mh=new HashSet();
		mh.add("Pune");
		mh.add("Nagpur");
		
		Set jh=new HashSet();
		jh.add("Ranchi");
		jh.add("Janshedpur");

		Set india=new HashSet();
		india.add(mh);
		india.add(jh);
		
		Set ny=new HashSet();
		ny.add("Fredonia");
		ny.add("Dunkirk");

		Set california=new HashSet();
		california.add("Redwood city");
		california.add("San Diego");
		
		Set us=new HashSet();
		us.add(ny);
		us.add(california);
		
		Set world=new HashSet();
		world.add(india);
		world.add(us);
		
		 Iterator itr=world.iterator();
		 while(itr.hasNext()){
			 Set count=(Set)itr.next();
			  Iterator itr1=count.iterator();
			  while(itr1.hasNext()){
				  Set state=(Set)itr1.next();
				  Iterator itr2=state.iterator();
				  while(itr2.hasNext()){
					  String city=(String)itr2.next();
					  System.out.println(city);
				  }
			  }
		 }
		 
	}
		

}
