package com.inheritance17objects;

public class Test {
	public static void main(String[] args) {
		A a=new A();
		a.m1(); // 
		a.m2();
		System.out.println(a.a);//10
		System.out.println(a.b);// 20
		
		B b=new B();
		b.m1();
		b.m2();
		b.m3();
		b.m4();
		System.out.println(b.a);//30
		System.out.println(b.b);//50
		
		C c=new C();
		c.m1();
		c.m2();
		c.m3();
		c.m6();
		c.m7();
		System.out.println(c.a);//30
		System.out.println(c.b);//50
		System.out.println(c.x);//35
		System.out.println(c.y);//45
		
		D d=new D();
		d.m1();
		d.m2();
		d.m3();
		d.m4();
		d.m6();
		d.m7();
		System.out.println(d.a);//30
		System.out.println(d.b);//50
		System.out.println(d.c);//40
		System.out.println(d.x);//35
		System.out.println(d.y);//65
		
		E e=new E();
		e.m1();
		e.m2();
		e.m3();
		e.m4();
		System.out.println(e.a);//30
		System.out.println(e.b);//50
		System.out.println(e.d);//20
		System.out.println(e.e);//30
		
		F f=new F();
		f.m1();
		f.m2();
		f.m3();
		f.m4();
		f.m10();
		System.out.println(f.a);//10
		System.out.println(f.b);//50
		System.out.println(f.c);//90
		System.out.println(f.d);//20
		System.out.println(f.e);//30
		
		A a1=new B();
		a1.m1();
		a1.m2();
		System.out.println(a1.a);//10
		System.out.println(a1.b);//20
		
		A a2=new C();
		a2.m1();
		a2.m2();
		System.out.println(a2.a);//10
		System.out.println(a2.b);//20
		
		A a3=new D();
		a3.m1();
		a3.m2();
		System.out.println(a3.a);//10
		System.out.println(a3.b);//20
		
		A a4=new E();
		a4.m1();
		a4.m2();
		System.out.println(a4.a);//10
		System.out.println(a4.b);//20
		
		A a5=new F();
		a5.m1();
		a5.m2();
		System.out.println(a5.a);//10
		System.out.println(a5.b);//20
		
		B b1=new C();
		b1.m1();
		b1.m2();
		b1.m3();
		b1.m4();
		System.out.println(b1.a);//30
		System.out.println(b1.b);//50
		
		B b2=new D();
		b2.m1();
		b2.m2();
		b2.m3();
		b2.m4();
		System.out.println(b2.a);//30
		System.out.println(b2.b);//50
		
		B b3=new E();
		b3.m1();
		b3.m2();
		b3.m3();
		b3.m4();
		System.out.println(b3.a);//30
		System.out.println(b3.b);//50
		
		B b4=new F();
		b4.m1();
		b4.m2();
		b4.m3();
		b4.m4();
		System.out.println(b4.a);//30
		System.out.println(b4.b);//50
		
		C c1=new D();
		c1.m1();
		c1.m2();
		c1.m3();
		c1.m4();
		c1.m6();
		c1.m7();
		System.out.println(c1.a);//30
		System.out.println(c1.b);//50
		System.out.println(c1.x);//35
		System.out.println(c1.y);//45
	}
}


