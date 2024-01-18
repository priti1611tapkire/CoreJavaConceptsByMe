package com.typecasting;

public class Test {
	public Employee setDemp(){ 	
		Developer d=new Developer(); 
		d.empid=35;
		d.name="Mahesh";
		d.designation="Junior Engineer";
		d.nosprint=55;
		return d;
		} 
	public Employee setTemp() 	{
		Tester t=new Tester (); 	
		t.empid=65;
		t.name="Pranali";
		t.designation="Project Manager";
		t.notestcases= 12;
		return t;
		}
	 public static void main(String[] args) {
		 Test t=new Test();
		 Developer d1=(Developer) t.setDemp();
		 System.out.println("Emp Id="+d1.empid);
		 System.out.println("Emp Name="+d1.name);
		 System.out.println("Emp Desiganation="+d1.designation);
		 System.out.println("No Sprint="+d1.nosprint);
		 
		 
		 Tester t1=(Tester) t.setTemp();
		 System.out.println("Emp Id="+t1.empid);
		 System.out.println("Emp Name="+t1.name);
		 System.out.println("Emp Desiganation="+t1.designation);
		 System.out.println("No Test Cases="+t1.notestcases);
		 
	 }
		
}
	


