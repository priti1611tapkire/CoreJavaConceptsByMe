package super_this_bymethod;

public class B extends A {
	public void m1()
	{
		System.out.println("m1---B");
	}
	public void m2()
	{
	this.m1();
	super.m1();
		
	}

}
