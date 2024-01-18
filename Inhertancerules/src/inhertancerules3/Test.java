package inhertancerules3;

public class Test {
	public static void main(String[] args) {
		
	A a=new A(); 
	a.m1(); // M1----A
	System.out.println(a.a); // 10
	System.out.println(a.b); // 20
	
	B b=new B();
	b.m1(); // M1---B
	b.m2(); // M2---B
	System.out.println(b.a); //30
	System.out.println(b.b); //20
	
	C c=new C();
	c.m1(); // M1---A
	c.m2(); // M2---C
	c.m3(); // M3---C
	System.out.println(c.a);//40
	System.out.println(c.b); //20
	System.out.println(c.c);//50
	
	D d=new D();
	d.m1(); // M1---B
	d.m2(); // M2--B
	d.m3(); // M3---D
	d.m4(); // M3---D
	System.out.println(d.a);//30
	System.out.println(d.b);//60
	System.out.println(d.d); //70
	
	E e=new E();
		e.m1(); // M1---E
		e.m2(); // M2---C
		e.m3(); // M3---C
		e.m5(); // M5----E
		e.m6(); // M6----E
		System.out.println(e.a); //80
		System.out.println(e.b); //20
		System.out.println(e.c); //50
		System.out.println(e.d); //90
		System.out.println(e.e); //100
		
		
	A a1=new B();
	  a1.m1();  //M1---B
	  System.out.println(a1.a); // 10
	  System.out.println(a1.b); //20
	  
	A a2=new D();
	  a2.m1(); // M1---A
	  System.out.println(a2.a); //10
	  System.out.println(a2.b); //20
	  
	A a3=new C();
	  a3.m1(); // M1---A
	  System.out.println(a3.a);//10
	  System.out.println(a3.b);//20
	  
	A a4=new E();
	  a4.m1(); // M1---E
	  System.out.println(a4.a);//10
	  System.out.println(a4.b);//20
	  
	B b1=new D();
	  b1.m1();//M1---B
	  b1.m2(); //M2---B
	  System.out.println(b1.a);//30
	  System.out.println(b1.b); //20
	  
	C c1=new E();
	  c1.m1(); //M1---E
	  c1.m2(); //M2---C
	  c1.m3(); // M3---C
	  System.out.println(c1.a);//40
	  System.out.println(c1.b);//20
	  System.out.println(c1.c);//50
	    
	}  	
}

