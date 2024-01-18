package com.set;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Set;
//to sort elements of list and not remove duplicate elemnts from list

public class Test_Collectionsort {
	
		public static void main(String[] args) {
			List list=new ArrayList();
			list.add(11);
			list.add(12);
			list.add(11);
			list.add(13);
			list.add(14);
			list.add(12);
			list.add(15);
			list.add(13);
			list.add(17);
			System.out.println("List of elements: "+list);
			
			Collections.sort(list);
			//s.addAll(list);
			System.out.println("set of elements:  "+list);
		}

	}

