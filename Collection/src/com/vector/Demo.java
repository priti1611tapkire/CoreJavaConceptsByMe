package com.vector;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class Demo {
public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println(v.capacity()); //10
		for(int i = 1; i<=9; i++) {
		v.addElement(i);
		}
		v.add("A");
		v.add("B");
		//v.remove(11);
		System.out.println(v.capacity()); //10
		System.out.println(v.capacity()); //20..10
		System.out.println(v); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, A]
		}
	
	/*public static void main(String[] args) {
		Stack s = new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s); //[A, B, C]
		System.out.println(s.search("A")); //3
		System.out.println(s.search("Z")); //-1
	
		System.out.println(s.peek());//it will give you top of the element of stack - C
		s.pop();
		System.out.println(s); //after pop [A, B] - s.pop(); method will remove top element of stack - C
		
		System.out.println(s.empty());//it check stack is or not empty
		
		
		System.out.println(s.search("B"));//search shows index value */
	/*public static void main(String[] args) {
		Vector v = new Vector();
		for(int i=0; i<=10; i++) {
		v.addElement(i);
		}
		//System.out.println(v);
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
		Integer I = (Integer)e.nextElement();
		//if(I%2 != 0)
		System.out.println(I);
		}
		//System.out.println(v);
		
		
		
		}*/

}
