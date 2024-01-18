package com.cset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Country3 {
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
	
		
		for(Set<Set<String>>count:world){
			for(Set<String> state: count){
				for(String city: state){
					System.out.println(city);
				}
			}
		}
}



}
