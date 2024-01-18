package comex;

public class Throwsk {

	public void m1() {
		m2();
		System.out.println("m1");
	}

	public static void m2() {
		try{
			Thread t=new Thread();
			t.setPriority(12);
			
			try{
				System.out.println("in inner try");
				String s=null;
				System.out.println(s.hashCode());
			}
			catch (NullPointerException e) {
				// TODO: handle exception
				System.out.println("Inner Catch");
			}
			System.out.println("in outer try");
			System.out.println(10/0);
			
		}
		
		catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println("in illgal");
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("outer catch");
		}
		

	}

	public static void main(String[] args) {
		Throwsk t=new Throwsk();
		t.m1();
		System.out.println("main");
	}
}
