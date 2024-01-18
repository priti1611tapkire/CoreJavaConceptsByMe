package com.secondaryreferance;

public class Test {
	public static void main(String[] args) {
		Mobileno m=new Mobileno();
		m.setEfirstmobno(22);
		m.setEsecondmobno(55);
		
		Name n=new Name();
		n.setEname("Kunal");
		n.setEnickname("Chiku");
		
		Employee e=new Employee();
		e.setEid(2);
		e.setSalary(2200);
		e.setMno(m);
		e.setName(n);
		System.out.println(e.getEid());
		System.out.println(e.getSalary());
		System.out.println(e.getMno().getEfirstmobno());
		System.out.println(e.getMno().getEsecondmobno());
		System.out.println(e.getName().getEnickname());
		System.out.println(e.getName().getEname());
		
		
	}

}
