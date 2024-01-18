package com.Test_26_11_2020;

import java.util.*;

public class Company {
	public List<Employee> m1(){
		List<Employee> list=new ArrayList<Employee>();
		Employee e=new Employee();
		e.setEid(258);
		e.setName("NIHAL");
		e.setEsalary(95000);
		e.setEmob(95852886255L);

		Employee e1=new Employee();
		e1.setEid(256);
		e1.setName("RAHUL");
		e1.setEsalary(90000);
		e1.setEmob(95852956255L);
		list.add(e);
		list.add(e1);
		return list;

	}
}
