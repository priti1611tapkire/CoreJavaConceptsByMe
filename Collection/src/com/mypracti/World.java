package com.mypracti;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class World {

	public static void main(String[] args) {

		List<String> mh=new ArrayList<>();
		mh.add("PUNE");
		mh.add("ABAD");

		List<String> wb=new ArrayList<>();
		wb.add("KOLKATA");
		wb.add("KGP");

		Set <List<String>> india=new HashSet<>();
		india.add(mh);
		india.add(wb);

		List<String> la=new ArrayList<>();
		la.add("CALIFORNIA");
		la.add("lASV");

		List<String> ny=new ArrayList<>();
		ny.add("NEWYORK");
		ny.add("LAS-VEGAS");

		Set <List<String>> us=new HashSet<>();
		us.add(la);
		us.add(ny);

		Map<String, Set<List<String>>> m=new HashMap<>();
		m.put("ind", india);
		m.put("usa", us);

		Set<String> keys=m.keySet();
		//		Iterator<String> itr=keys.iterator();
		//		while(itr.hasNext()){
		//			String key=itr.next();
		//			System.out.println(key);
		//			Set<List<String>> s1=m.get(key);
		//			System.out.println(s1);
		//			Iterator itr1=s1.iterator();
		//			while(itr1.hasNext()){
		//				List<String> s2=(List<String>) itr1.next();
		//				System.out.println(s2);
		//				Iterator itr2=s2.iterator();
		//				while(itr2.hasNext()){
		//					String s3=(String) itr2.next();
		//					System.out.println(s3);
		//				}
		//			}




		for(String key:keys){
			System.out.println(key);
			Set<List<String>> s1=m.get(key);
			System.out.println(s1);
			for(List<String> s2:s1){
				System.out.println(s2);
				for(String s3:s2){
					System.out.println(s3);
				}
			}
		}

	}

}

