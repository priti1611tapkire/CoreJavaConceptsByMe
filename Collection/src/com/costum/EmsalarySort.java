package com.costum;

import java.util.Comparator;

public class EmsalarySort implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getSalary()-o2.getSalary());
	}

}
