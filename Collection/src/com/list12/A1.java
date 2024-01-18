package com.list12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//2. Write the collection program to add 73.30f, 256.39d, 11, 77L, 79.10, 87D, 58l all this element into the list and 
//retrieve this element by using iterator.
public class A1 {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(73.30f);
		list.add(256.39d);
		list.add(11);
		list.add(77l);
		list.add(79.10);
		list.add(87D);
		list.add(581d);
		
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			Object o=itr.next();
			if(o instanceof Double){
				Double x=(Double)o;
				System.out.println(x);
				}
			   else if(o instanceof Integer){
				   int i=(int)o;
				   System.out.println(i);
			   }
			   else if(o instanceof Long){
				   long l=(long)o;
				   System.out.println(l);
			   }
				
				else if(o instanceof Float){
					Float y=(Float)o;
					System.out.println(y);
				}
				
	}

}
}
	

