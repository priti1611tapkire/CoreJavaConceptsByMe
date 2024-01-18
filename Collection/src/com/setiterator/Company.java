package com.setiterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Company  {    
	public List designation(){       //set all employee data and add it into the generic set and then list here      
		List  team=new ArrayList();    
		
		Employee e=new Employee();    
		e.setEid(5);
		e.setEname("Manu");
		e.setEsalary(25000);
		
		Employee e1=new Employee(); 
		e1.setEid(15);
		e1.setEname("Shivani");
		e1.setEsalary(24000);
		Set developer=new HashSet(); 
		developer.add(e);
		developer.add(e1);
		
		Employee e2=new Employee();   
		e2.setEid(25);
		e2.setEname("Shiv");
		e2.setEsalary(28000);
		Employee e3=new Employee(); 
		e3.setEid(52);
		e3.setEname("veer");
		e3.setEsalary(35000);
		Set tester=new HashSet();
		tester.add(e2);
		tester.add(e3);
		
		
		team.add(developer);
		team.add(tester);
		return team;
		} 
         public static void main(String args[]){      
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
}
}
