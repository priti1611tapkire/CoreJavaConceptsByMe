package com.iteratortask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List mh=new ArrayList();
		mh.add("Pune");
		mh.add("Mumbai");
		mh.add("Nagpur");
		
		List jh=new ArrayList();
		jh.add("Ranchi");
		jh.add("Jamshedpur");
		
		List india=new ArrayList();
		india.add(mh);
		india.add(jh);
		
		Iterator itr=india.iterator();
		while(itr.hasNext()){
			List list=(List)itr.next();
			
			Iterator itr1=list.iterator();
			while(itr1.hasNext()){
				String val=(String)itr1.next();
				System.out.println(val);
			}
		
		}
	}

}
