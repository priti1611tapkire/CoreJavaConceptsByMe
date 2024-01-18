package com.withiteratorwithloop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


import com.setiterator.Employee;

public class Company {
	public List designation(){       		
		//set all student data and add it into the list here        		
		Employee dev1=new Employee();   
		dev1.setEid(22);
		dev1.setEname("priya");
		dev1.setEsalary(20000);
		Employee dev2=new Employee();  
		dev2.setEid(21);
		dev2.setEname("riya");
		dev2.setEsalary(25000);
		
		Employee test1=new Employee();   
		test1.setEid(20);
		test1.setEname("Neha");
		test1.setEsalary(15000);
		Employee test2=new Employee();  
		test2.setEid(19);
		test2.setEname("Sneha");
		test2.setEsalary(18000);
		List<Object>developer=new ArrayList<>();    
		developer.add(dev1);
		developer.add(dev2);
		
		List<Object> tester=new ArrayList<>();  	
		tester.add(test1);
		tester.add(test2);
		
		List<List<Object>>manager=new ArrayList<>(); 
		manager.add(developer);
		manager.add(tester);
		
		return manager;    	}    
	public static void main(String args[]){ 
		Company c=new Company();
		List<List<Object>>list=c.designation();
		Iterator<List<Object>> itr=list.iterator();
		while(itr.hasNext()){
			List<Object>list1=itr.next();
			Iterator<Object>itr1=list1.iterator();
			while(itr1.hasNext()){
				Employee emp=(Employee) itr1.next();
				System.out.println(emp.getEid());
				System.out.println(emp.getEname());
				System.out.println(emp.getEsalary());
			}
		}
		
		
	
		
	}
}


 /*public static void main(String args[]){      
	 Company c=new Company();
	 List  list=new ArrayList();
	 list=c.designation();
	 
Iterator itr=list.iterator();// team
 while(itr.hasNext()){// developer true....tester....true.....true
	 Set s=(Set)itr.next();// developer// more data present in developer//tester// more data present in developer
	 Iterator itr1=s.iterator(); // for that we create 1 more iterator(same for tester)
	 while(itr1.hasNext()){// e true e1...true....false         e2...true      e3 ...true....false               
		 Employee e=(Employee)itr1.next();//e       e1                e2       e3
		 System.out.println(e.getEid());//5          15              25         52
		 System.out.println(e.getEname());//manu     shivani       shiv         veer
		 System.out.println(e.getEsalary());//25000    24000....   28000        35000
		 //no more data present in developer 
		 //no more data present in tester 
	 }
	 
	 
 } 
}*/