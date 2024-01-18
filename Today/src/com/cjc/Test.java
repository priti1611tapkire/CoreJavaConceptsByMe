package com.cjc;

public class Test {
	public static void main(String[] args){
	
	Karvenagar kng=new Karvenagar();
	kng.setRollno(1);
	kng.setSname("Kunal");
	kng.setCourse("Java");
	kng.setRegularbatch("b125");
	
	Akurdi akd=new Akurdi();
	akd.setRollno(2);
	akd.setSname("Siya");
	akd.setCourse("python");
	akd.setWeekendbatch("b11");
	
	System.out.println(kng.getRollno());
	System.out.println(kng.getSname());
	System.out.println(kng.getCourse());
	System.out.println(kng.getRegularbatch());
	System.out.println(akd.getRollno());
	System.out.println(akd.getSname());
	System.out.println(akd.getCourse());
	System.out.println(akd.getWeekendbatch());
	}
}
