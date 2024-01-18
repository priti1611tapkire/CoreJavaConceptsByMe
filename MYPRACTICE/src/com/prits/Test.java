package com.prits;

public class Test {
	public static void main(String[] args) {
		A a=new A();
		a.m1();//M1---A
		a.m2();//M2---A
		System.out.println(a.a);//10
		System.out.println(a.b);//20
		System.out.println("==============");
		
		A a1=new B();
		a1.m1();////M1---B
		a1.m2();////M2---A
		System.out.println(a1.a);//10
		System.out.println(a1.b);//20
		System.out.println("==============");
		A a2=new C();
		a2.m1();
		a2.m2();
		System.out.println(a2.a);//
		System.out.println(a2.b);//
		System.out.println("==============");
		B b=new B();
		b.m1();
		b.m2();
		b.m3();
		System.out.println(b.a);//
		System.out.println(b.b);//
		System.out.println(b.c);//
		System.out.println("==============");
		B b1=new C();
		b1.m1();
		b1.m2();
		b1.m3();
		System.out.println(b1.a);//
		System.out.println(b1.b);//
		System.out.println(b1.c);//
		System.out.println("==============");
		C c=new C();
		c.m1();
		c.m2();
		c.m3();
		System.out.println(c.a);//
		System.out.println(c.b);//
		System.out.println(c.c);//
		
		
	}

}
