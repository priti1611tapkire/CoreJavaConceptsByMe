package com.treeset;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String i1=(String)o1;
		String i2=(String)o2;
		return i2.compareTo(i1);
		
	}
	

}
