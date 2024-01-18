package com.map;

import java.util.*;

public class Map_1 {
	public static void main(String[] args) {
		//List list=new ArrayList();
		List mh=new ArrayList();
		mh.add("Pune");
		mh.add("Auangabad");
		
		List jh=new ArrayList();
		jh.add("Ranchi");
		jh.add("Jamshedpur");
		
		Map india=new HashMap();
		india.put(1,mh);
		india.put(2, jh);
		
		Set<Integer>keys=india.keySet();
		 Iterator<Integer> itr=keys.iterator();
		 while(itr.hasNext()){
			 int key=(int)itr.next();
			 System.out.println(key);
			 List list=(List) india.get(key);
			 Iterator itr1=list.iterator();
			 while(itr1.hasNext()){
				 String s=(String)itr1.next();
				 System.out.println(s);
			 }
		 }
		/*for(int key:keys){
			System.out.println(key);
			List val=(List) india.get(key);
			for(String val1:val){
				System.out.println(val1);
			}
		}*/
		
	}

}
