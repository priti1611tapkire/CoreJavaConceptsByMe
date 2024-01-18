package comex;

public class ArithmaticExceptionEx {

	public static void main(String[] args) {
		try{
		System.out.println(10/0);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
		System.out.println("GOOD DAY");
		}
	}
}
