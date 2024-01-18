package com.country;

import java.util.ArrayList;
import java.util.List;

public class Country3 {
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
		
		for(List<List<String>>count:world){
			for(List<String> state: count){
				for(String city: state){
					System.out.println(city);
				}
			}
		}
}

}
