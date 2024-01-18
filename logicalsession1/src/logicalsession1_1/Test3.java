package logicalsession1_1;

public class Test3 {
	public static void main(String[] args) {
		int x=50;
		int y=20;
		if(x<y){
			System.out.println("x:: "+x);
		}
		else if(y<x || y!=x){
			System.out.println("y is less than "+x);
		}
		else{
			System.out.println("Both numbers are non-zero");
		}
		}

}
