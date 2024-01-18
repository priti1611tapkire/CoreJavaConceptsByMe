package inheritancerules2;

public class Test {
	public static void main(String[] args) {
		A a=new A();
		 a.m1();  // M1---A
		 a.m2();   // M2---A
		 System.out.println(a.a); //10
		 System.out.println(a.b); //20
		 
		 B b=new B();
		  b.m1(); // M1---B
		  b.m2(); // M1---A
		  System.out.println(b.a); // 30
		  System.out.println(b.b); // 20
		  
		 C c=new C();
		  c.m3();   // M3---C
		  c.m2();   // M2---C
		  c.m1();   // M1---B
		  System.out.println(c.a); // 40
		  System.out.println(c.c); // 50
		  System.out.println(c.b); // 20
		 
		  E e=new E();
		  e.m1();
		  e.m2();
		  e.m3();
		  e.m4();
		  System.out.println(e.a); // 40
		  System.out.println(e.c); // 50
		  System.out.println(e.b); // 20
		  System.out.println(e.d); // 70
		  
		 A a1=new B();
		 a1.m1(); // M1---B
		 a1.m2();  // M2----A
		 System.out.println(a1.a); //10
		 System.out.println(a1.b); // 20
		 
		 A a2=new C();
		 a2.m1(); // M1--B
		 a2.m2();  // M2---C
		 System.out.println(a2.a); //10
		 System.out.println(a2.b); // 20
		 
		 A a3=new E();
		 a3.m1(); // M1---B
		 a3.m2(); // M2---C
		 System.out.println(a3.a); // 10
		 System.out.println(a3.b); // 20
		 
		 
		 B b1=new C();
		 b1.m1(); // M1---B
		 b1.m2(); // M2---C
		 System.out.println(b1.a); // 30
		 System.out.println(b1.b); // 20
		 
		 B b2=new E();
		 b2.m1(); // M1---B
		 b2.m2();// M2---C
		 System.out.println(b2.a); // 30
		 System.out.println(b2.b); // 10
		 
		 C c2=new E();
		  c2.m1(); // M1---B
		  c2.m2(); // M2---C
		  c2.m3(); // M3---C
		  System.out.println(c2.a); // 40
		  System.out.println(c2.b); // 20
		  System.out.println(c2.c); // 50
	}


}
