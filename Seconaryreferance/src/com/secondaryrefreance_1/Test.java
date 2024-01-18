package com.secondaryrefreance_1;

public class Test {
	public static void main(String[] args) {
		Address ad=new Address();
		ad.setAreanm("Karvenagar");
		ad.setCitynm("Pune");
		
		Student s=new Student();
		s.setRollno(21);
		s.setName("Kunal");
		s.setAddr(ad);
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		System.out.println(s.getAddr().getCitynm());
		System.out.println(s.getAddr().getAreanm());
	}

}
