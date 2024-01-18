package com.withoutiterator;

import java.util.HashSet;
import java.util.Set;

public class India_forloop {
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
		
		for(Set<String> state:india){
			 for(String city:state)
			 {
				 System.out.println(city);
			 }
		}
	}

}
