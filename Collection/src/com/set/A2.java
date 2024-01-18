package com.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A2 {
public static void main(String[] args) {
	List a1=new ArrayList();  
	a1.add("aaAA"); //4    97   97 	
	a1.add("AaA"); //2      65   97 	
	a1.add("aAAa"); //3     97    65 	
	a1.add("AAaa"); //1     65   65 	
	Collections.sort(a1); 	
	System.out.println(a1); 
}
}
