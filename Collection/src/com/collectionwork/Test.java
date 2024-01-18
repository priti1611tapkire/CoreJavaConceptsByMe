package com.collectionwork;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//. Write the program to add 33.3, 22.39d, 19.03, 97.23D, 78.1, 16d all this element into the list and retrieve this element by using iterator

public class Test {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(33.3d);
		list.add(22.39d);
		list.add(19.03);
		list.add(97.23D);
		list.add(78.1d);
		list.add(16d);
		
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			double d=(double)itr.next();
			System.out.println(d);
		}
	}

}
