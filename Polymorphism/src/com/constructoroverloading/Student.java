package com.constructoroverloading;

public class Student {
	int rollno=100;
	//public Student(int rollno){
	//	this.rollno=rollno;
	
   public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public static void main(String[] args) {
		Student o=new Student();
		o.setRollno(22);
		System.out.println(o.getRollno());
		
	}

}
