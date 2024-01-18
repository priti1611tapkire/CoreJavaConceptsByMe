package com.secondaryreferance_2;

public class Test {
	public static void main(String[] args) {
		Salary sal=new Salary();
		sal.getOriginalsalary();
		sal.setExtrasalary(5);
		
		Employee s=new Employee();
		s.setEid(22);
		s.setEmob(6452);
		s.setEname("Kunal");
		s.setEsalary(sal);
		
		System.out.println(s.getEid());
		System.out.println(s.getEmob());
		System.out.println(s.getEname());
		System.out.println(s.getEsalary().getOriginalsalary());
		System.out.println(s.getEsalary().getExtrasalary());
		
		
		
		
	}

}
