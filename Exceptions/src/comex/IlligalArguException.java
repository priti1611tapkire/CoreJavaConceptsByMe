package comex;

public class IlligalArguException {
	public static void main(String[] args) {
		Thread t=new Thread();
		t.setPriority(5);
		System.out.println(t.getPriority());
		t.setPriority(50);
		System.out.println(t.getPriority());
	}
}
