package com.map;

import java.util.*;

public class Test25 {
	
	public static void main(String[] args)
	{
	HashMap h=new HashMap();
	h.put("sambha",100);
	h.put("veeru",100);
	h.put("durga",100);
	System.out.println(h);// {durga=100, verru=100, sambha=100...map}
	
	Set s=h.keySet();
	System.out.println(s);///map =key
	Collection c=h.values();// 
	System.out.println(c);//(values)
	Set s1=h.entrySet();
	System.out.println(s1);//[durga=100, verru=100, sambha=100...map]
	Iterator itr=s1.iterator();//
	while (itr.hasNext())// true, true, true
	{
	Map.Entry m1=(Map.Entry)itr.next();//durga, 100 ... veeru, 100....sambha, 100
	System.out.println(m1.getKey()+"------"+m1.getValue());//  m1.getKey()=durga & m1.getValue()=100 
	if (m1.getKey().equals("sambha"))// durga.eqaul("sambha")....false
	{
	m1.setValue("gayan TeamLead");
	}
	}
	System.out.println(s1);


}
}