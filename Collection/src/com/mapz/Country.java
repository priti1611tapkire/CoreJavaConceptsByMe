package com.mapz;
import java.util.*;
public class Country {
	public static void main(String[] args) {

		Map<String, String> mh=new HashMap<>();  //map-state key,value - mh-pune mubai
		mh.put("PUNE","Pune");
		mh.put("ABAD", "Abad");
		mh.put("MUM", "Mumbai");

		Map<String, String> jh=new HashMap<>(); //jh- ranchi, jam
		jh.put("RANCHI", "Ranchi");
		jh.put("JM", "Jamshedpur");

		Map<String, Map<String,String>> india=new HashMap<>();  //mh,jh-india
		india.put("MAHARASHTRA", mh);
		india.put("JHARKHAND", jh);

		Map<String, String> ny=new HashMap<>();   //state - 
		ny.put("SAN","san diago");
		ny.put("Ariz", "arizona");
		ny.put("orn", "orlans");
		
		Map<String, String> california=new HashMap<>(); //satte
		california.put("LAS", "los angels");
		california.put("VEGAS", "vegas");


		Map<String, Map<String,String>> us=new HashMap<>();// usa- ny, calim
		us.put("NEWYOK", ny);
		us.put("California", california);

		Map<String, Map<String, Map<String,String>>> world=new HashMap<>();   //world- india,us
		world.put("INDIA", india);
		world.put("UNITED-STATE", us);
		
		
		System.out.println("BY USING FOR LOOP"); 
		Set<String> keys=world.keySet();   //INDIA , US
		for(String key:keys){  //INDIA
			System.out.println(key);// united state & india
			Map<String, Map<String,String>> country=world.get(key);
			Set<String> countrykeys=country.keySet(); //
			for(String countrys:countrykeys){ //maha
				System.out.println(countrys);// california NY   Mharashtra & jharkhand
				Map<String, String> state=country.get(countrys);  //mh
				Set<String>statekeys=state.keySet();  //mh-pune mumbai
				for(String statekey:statekeys){   //
					System.out.println(statekey);// citys 
					System.out.println(state.get(statekey));  //pune
				}

			}
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		System.out.println("BY USING ITERATOR");
		Iterator<String> itr=keys.iterator();
		while(itr.hasNext()){
			String countrykey=itr.next();
			System.out.println(countrykey);
			Map<String, Map<String,String>> country=world.get(countrykey);
			Set<String> countrykeys=country.keySet();
			Iterator<String> itr1=countrykeys.iterator();
			while(itr1.hasNext()){
				String statekey=itr1.next();
				System.out.println(statekey);
				Map<String, String> state=country.get(statekey);
				Set<String>statekeys=state.keySet();
				Iterator<String> itr2=statekeys.iterator();
				while(itr2.hasNext()){
					String citykey=itr2.next();
					System.out.println(citykey);
					String city=state.get(citykey);
					System.out.println(city);
				}
			}
		}
	}



}
