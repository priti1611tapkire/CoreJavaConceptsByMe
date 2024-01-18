package com.taskiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Details {
	public List setdetails(){ 		
		List l=new ArrayList();        		
		//set employee data here and add it into list.        	
		Employee e=new Employee();
		e.setEmpid(22);
		e.setEmpname("Neha");
		e.setEmpdesig("senior manager");
		e.setEmpsalary(45000);
		l.add(e);
		Employee e1=new Employee();
		e1.setEmpid(24);
		e1.setEmpname("Sneha");
		e1.setEmpdesig("junior manager");
		e1.setEmpsalary(35000);
		l.add(e1);
		return l;
		
	}     
	public void getdetails( List l1){        		
		//get employee data here using iterator.
		Iterator itr=l1.iterator();
		while(itr.hasNext()){// true                              ....true ...............false>>>>out of loop then progm terminated
			Employee e=(Employee)itr.next();//e                                e1
			System.out.println(e.getEmpid());// 22                            24
			System.out.println(e.getEmpname());//Neha                          Sneha
			System.out.println(e.getEmpdesig());//Senoir manager                Junior Engineer
			System.out.println(e.getEmpsalary());// 45000                       35000
			System.out.println("here display");//
			// out of loop                                          out of loop
		}
	}
	}
