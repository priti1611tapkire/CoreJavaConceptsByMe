package com.treeset;

import java.util.TreeSet;

public class Demo1 {
	//customized sorting order 
	public static void main(String[] args) { 	
		//need to implement comparator interface because customized 	sorting 		
		TreeSet t=new TreeSet(new MyComparator()); 		
		t.add("A"); 		
		t.add("Z"); 		
		t.add("B"); 		
		t.add("A");
		System.out.println(t);    
	}
	          
}
