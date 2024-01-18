package com.withoutiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A {
	public static void main(String[] args) {
		List<Double>d=new ArrayList<>();
		d.add(500D);
		d.add(600D);
		
		Iterator<Double> itr=d.iterator();
		while(itr.hasNext()){
			Double d1=itr.next();
			System.out.println(d1);
			
		}
	}

}
