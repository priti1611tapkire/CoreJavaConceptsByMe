package com.costum;

import java.util.Comparator;

public class EmidSort implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmid()-o2.getEmid();
	}
}
