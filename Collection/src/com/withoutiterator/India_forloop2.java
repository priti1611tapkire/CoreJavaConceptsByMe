package com.withoutiterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class India_forloop2 {
	public static void main(String[] args) {
		List<String> mh=new ArrayList<>();
		mh.add("Pune");
		mh.add("Mumbai");
		mh.add("Nagpur");
		
		List<String> jh=new ArrayList<>();
		jh.add("Ranchi");
		jh.add("Jamshedpur");
		
		
		Set<List<String>> india=new HashSet<>();
		india.add(mh);
		india.add(jh);
		for(List<String>state:india){
			for(String city:state){
				System.out.println(city);
			}
		}
	}

}
