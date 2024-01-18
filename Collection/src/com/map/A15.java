package com.map;

import java.util.*;

public class A15 {
	public static void main(String[] args) {
		
		List<Integer>l1=new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		
		List<List<Integer>>list=new ArrayList<>();
		list.add(l1);
		
		Iterator<List<Integer>> itr=list.iterator();
		while(itr.hasNext()){
			List<Integer> l2=itr.next();
			Iterator<Integer> itr1=l2.iterator();
			while(itr1.hasNext()){
				int i=itr1.next();
				System.out.println(i);
			}
		}
		
		for(List<Integer> list2:list){
			for(int list3:list2){
				System.out.println(list3);
			}
		}
	}

}
