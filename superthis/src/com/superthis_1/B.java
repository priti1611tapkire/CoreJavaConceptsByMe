package com.superthis_1;

public class B extends A {
	int x=21;
	public B()
	{ this("xyz");
		System.out.println("Constructor-----B");
	}
	public B(int i)
	{
		super();
		System.out.println("Constrctor---B----int");
	 }
	public B(String s)
	{ this(4);
	 System.out.println("Constrctor----B-----String");
	}
	
}


