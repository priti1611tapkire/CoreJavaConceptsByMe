package com.withoutiterator;

import java.util.ArrayList;
import java.util.List;

public class Country {
public static void main(String[] args) {
	List<String>mh=new ArrayList<>();
	mh.add("Pune");
	mh.add("Nagpur");
	
	List<String>jh=new ArrayList<>();
	jh.add("Ranchi");
	jh.add("Jamshedpur");
	
	
	List<List<String>>india=new ArrayList<>();
	india.add(mh);
	india.add(jh);
	for(List<String>list:india){
		for(String city:list){
			System.out.println(city);
		}
		
	}
	
}
}
