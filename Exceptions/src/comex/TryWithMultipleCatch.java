package comex;

public class TryWithMultipleCatch {


	public void m1() {
		m2();
		System.out.println("m1");
	}

	public static void m2() {
		try{
//			Thread t=new Thread();
//			t.setPriority(12);
//			String s=null;
//			System.out.println(s.hashCode());
			//System.out.println(10/0);
			int i=Integer.parseInt("ten");
			

		}
		catch (NumberFormatException  | ArithmeticException e1) {
			// TODO: handle exception
			System.out.println(" in num and in ari");
		}
		catch (IllegalArgumentException  |NullPointerException e) {
			// TODO: handle exception
			System.out.println("in illgal");
		}
//		catch () {
//			// TODO: handle exception
//			System.out.println("in null");
//		}
//		catch () {
//			// TODO: handle exception
//			System.out.println("outer catch");
//		}
//		
	}

	public static void main(String[] args) {
		TryWithMultipleCatch t=new TryWithMultipleCatch();
		t.m1();
		System.out.println("main");
	}
}
