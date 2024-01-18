package com.costum;

import java.util.Comparator;

public class EmnameSort implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		//Employee ee1=(Employee)o1;
		//Employee ee2=(Employee)o2;
		
		return o1.getEmname().compareTo(o2.getEmname());
	}

}
