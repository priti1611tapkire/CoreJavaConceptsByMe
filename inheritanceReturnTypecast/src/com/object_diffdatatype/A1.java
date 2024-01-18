package com.object_diffdatatype;

public class A1{
	public String m1(){ // String also a predefind class in java 
		return "CJC";
	}
	public Object m2(){ // Object is pre-defind class in java and all primitive data types & primitive data type is child of object class
		// object-parents including String all primitive data types 
		//Number- parents of integer, double, float,long, short, byte
		
		return "Karvenagar";
	}
	public int m3(){
		return 10;
	}
	public double m4(){
		return 10d;
	}
	public byte m5(){
		return 25;
	}
     public static void main(String[] args) {
		A1 a=new A1();
		String s=(String)a.m1();
		Object o=a.m1();
		//double d=(double)a.m1();------error
		
		Object o1=a.m3();
		//String s1=(int)a.m2();----int dose not convert into string
		String s2=(String)a.m2();
		
		long l=a.m3();
		//byte b=a.m3();------int is greater than byte
		short s3=(short)a.m3();
		
		double d1=a.m4();
		//String s4=(String)a.m4();-----Number dose not convert String
		
		byte b1=a.m5();// range -28 to +28
		int i=a.m5();
		
		//System.out.println(a);
		// System.out.println);
     }
     
}
