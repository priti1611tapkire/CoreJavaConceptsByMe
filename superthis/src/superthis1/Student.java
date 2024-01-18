package superthis1;

public class Student extends Person {
	public void msg(){
		System.out.println("Student class");
	}
	public void display(){
		msg();
		super.msg();
		
	}

}
