package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Details1 {
	public 	Map<String,List<Stud>> setdet(){
		Map<String,List<Stud>>map =new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("No of student: ");
		int no=sc.nextInt();

		for(int i=1; i<=no; i++){
			List list=new ArrayList();
			Stud stu=new Stud();
			System.out.println("Enter roll no: ");
			int a=sc.nextInt();
			System.out.println("Enter Name:  ");
			String s=sc.next();

			stu.setRollno(a);
			stu.setName(s);

			list.add(stu);
			map.put("List", list);
		}
		return map;
	}
	public void getdet2(Map<String, List<Stud>> map){
		Set<String>set=map.keySet();
		for(String s:set){
			List<Stud> list=map.get(s);
			for(Stud stu1:list){
				System.out.println(stu1.getRollno());
				System.out.println(stu1.getName());
			}

		}
	}
}
