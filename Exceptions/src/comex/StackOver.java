package comex;

public class StackOver {
	public void m1(){
		m2();
	}
	public void m2(){
		m1();
	}
public static void main(String[] args) {
	System.out.println("in main");
	StackOver s=new StackOver();
	s.m1();
}
}
