package inheritancerules1;

public class Test {
	public static void main(String[] args)
	{
		A a=new A();
		a.m1();
		a.m2();
		System.out.println(a.a);
		System.out.println(a.b);
	
		B b=new B();
		b.m1();
		b.m2();
		b.m3();
		System.out.println(b.a);
		System.out.println(b.c);
		System.out.println(b.b);
	
		C c=new C();
		c.m1();
		c.m2();
		c.m3();
		System.out.println(c.a);
		System.out.println(c.c);
		System.out.println(c.b);
	
		A a1=new B();
		a1.m1();
		a1.m2();
		System.out.println(a1.a);
		System.out.println(a1.b);
		A a2=new C();
		a2.m1();
		a2.m2();
		System.out.println(a2.a);
		System.out.println(a2.b);
	
		B a3=new C();
		a3.m1();
		a3.m2();
		a3.m3();
		System.out.println(a3.a);
		System.out.println(a3.b);
		System.out.println(a3.c);
		System.out.println();
		
	}
	 
}
