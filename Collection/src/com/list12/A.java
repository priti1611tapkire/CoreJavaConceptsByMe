package com.list12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//1.Write the collection program to add 34, "abc", 'm', "xyx",45, 'A' all this element into the list and retrieve this element by using iterator. 
public class A {
	public static void main(String[] args){
		List list=new ArrayList();
		list.add(34);
		list.add("abc");
		list.add('m');
		list.add("xyz");
		list.add(45);
		list.add('A');
		
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			Object o=itr.next();
			if(o instanceof Integer){
				int x=(int)o;
				System.out.println(x);
			  }
			else if(o instanceof String){
				String s=(String)o;	
				System.out.println(s);
			}
			else if(o instanceof Character){
				char c=(char)o;
				System.out.println(c);
			}
			//else if(o instanceof Double){
			//	Double d=(Double)o;
			//}
			
	}
}
}

	
	


