package com.country;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Country {
	public static void main(String[] args) {

		List mh=new ArrayList();
		mh.add("Pune");
		mh.add("Nagpur");

		List jh=new ArrayList();
		jh.add("Ranchi");
		jh.add("Janshedpur");

		List india=new ArrayList();
		india.add(mh);
		india.add(jh);

		List ny=new ArrayList();
		ny.add("Fredonia");
		ny.add("Dunkirk");

		List california=new ArrayList();
		california.add("Redwood city");
		california.add("San Diego");

		List us=new ArrayList();
		us.add(ny);
		us.add(california);

		List world=new ArrayList();
		world.add(india);
		world.add(us);

		Iterator itr=world.iterator();//world
		while(itr.hasNext()){// india ...true...us ...false
			List count=(List)itr.next(); // india
			Iterator itr1=count.iterator();// india
			while(itr1.hasNext()){// mh...true...jh...true
				List state=(List)itr1.next();// mh...jh
				Iterator itr2=state.iterator();// pune...
				while(itr2.hasNext()){// pune ...true
					String city=(String)itr2.next(); //
					System.out.println(city);// pune
				}
			}
		}

}
}