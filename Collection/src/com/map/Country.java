package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Country {
	public static void main(String[] args) {
		List<String> mh=new ArrayList<String>();
		mh.add("Pune");
		mh.add("Mumbai");
		mh.add("Nagpur");

		List<String> jh=new ArrayList<String>(); 
		jh.add("Ranchi");
		jh.add("Jamshedpur");

//		List<Integer> g = new ArrayList<>();
//		g.add(10);
//		g.add(20);
		

		Map<String, List<String>> india=new HashMap<>();
		
		india.put("maharashtra", mh);// key=maharashtra AND val==mh==List<String> 
		india.put("jarkhand", jh);// key=jharkhand AND val==jh==List<String> 

		
		Set<String> keys=india.keySet();// india as a variable 

		Iterator<String> itr=keys.iterator(); //india==keys
		while(itr.hasNext()){// mh...true  jh....true....false
			String key=itr.next();// maharashtra      jharkhand
			System.out.println(key);// maharashtra       jharkhand
			List<String> val=india.get(key);// key=maharashtra...>mh  , key=jharkhand...>
			//System.out.println(val);// mh   jh   val= mh jh   mh-pune , mubai, nagpur
			Iterator<String> itr1=val.iterator();  //mh jh   val=mh  val=jh
			while(itr1.hasNext()){ //pune...true  Mumbai...true Nagpur...false     Ranchi...>true   jamshedpur....>true....false
				String val1=itr1.next(); // pune  mumbai  Nagpur              Ranchi       jamshedpur
				System.out.println(val1); //pune   mumbai nagpur            ranchi       jamshedpur
			} 
		}

		for(String key:keys){
			System.out.println(key);
			List<String>val=india.get(key);
			//System.out.println(val);
			for(String val1:val){
				//String val2=val1;
				System.out.println(val1);
			}
			
		}

	}

}


	












