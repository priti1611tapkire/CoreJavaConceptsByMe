package inheritanceReturnTypecast_1;

public class Test{
	public Object m1(){
		return 10;
	
	}
	public Object m2(){
		return "Priti";
	}
	public static void main(String[] args) {
		Test t=new Test();
		
		int x=(int)t.m1();
		System.out.println(x);
		
		String s=(String)t.m2();
		System.out.println(s);
		
	}
	

}
