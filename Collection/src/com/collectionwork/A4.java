package com.collectionwork;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class A4 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(15.3f);
		list.add(22.5f);
		
		
		Iterator itr=list.iterator();
		System.out.println(itr.hasNext());
		float f=(float)itr.next();
		System.out.println(f);
		
		System.out.println(itr.hasNext());
		float f1=(float)itr.next();
		System.out.println(f1);
		
		
		/*while(itr.hasNext()){
			float x=(float)itr.next();
			System.out.println(x);
		}*/
		
		
	}

}
