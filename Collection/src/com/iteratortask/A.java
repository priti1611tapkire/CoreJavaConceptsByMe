package com.iteratortask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A {
	public static void main(String[] args) {
		List list=new ArrayList();
		
		list.add("abc");
		list.add("xyz");
		list.add("pqr");
		list.add("mnp");
		list.add(1);
		list.add(2);
		
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			Object o=itr.next();
			if(o instanceof Integer){
				int x=(int)o;
				System.out.println(x);
			}
			else if(o instanceof String){
				String s=(String)o;
				
			}
		}
		
	}
}
