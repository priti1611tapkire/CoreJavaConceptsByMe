package com.collectionwork;

import java.util.ArrayList;
import java.util.List;

public class TestCheck {
	//14. Read, understand and check the methods of List interface.
		public static void main(String[] args)
		{
			List list=new ArrayList();
			//add
			list.add("abc");
			list.add("pqr");
			list.add(12);
			list.add(11);
			list.add(12);
			list.add(3,1111);
			System.out.println("Original:------------- "+list +"-----------------------");
			
			//Arraylist=[****] here****=array elements, no of stars= array index...[****]=complete array
			
			//addAll
			//List list2=new ArrayList();
			//list2.add(list);
			//list2.add(10);
			//System.out.println("Using add: "+ list2);//here all array elements print
			
			//List list3=new ArrayList();
			//list3.addAll(list);
			//System.out.println("Using addAll: "+list3);// here complete array print with additional add all[] array
			
			
			//get
			//System.out.println("Using get at 2th index: "+list.get(2));//here we declared index that we want 
			
			
			///remove
		//	list.remove(2);
			//System.out.println("Using remove at 2th index: "+list);// this method use remove array elements that we dosent want
			
			
			//set
			//list.set(1, 4500);
			//System.out.println("Using set at 1st index: "+list);//here we can replace any array element becz of any reason
			
			
			//indexOf
			//System.out.print("index of abc: ");
			//System.out.println(list.indexOf(12));...here we enter element value and find their index
			
			
			
			//contains
			//System.out.print("contains of 12: ");
			//System.out.println(list.contains(12));//here we find the element value in given index if it is present or not if it is present then it gives us true or else false
			
			
			
			//lastIndexOf
			//System.out.print("lastindex of 12: ");
			//System.out.println(list.lastIndexOf(12));//this method start the checking from last index of array
			
			
			//size
			//System.out.print("Size of original list: ");
			//System.out.println(list.size());//this method we use for find out the size of array index
			
			
			//toString
			System.out.println(list.toString());// as is is give us array it dosent give us hashcode
			
		}

	}
