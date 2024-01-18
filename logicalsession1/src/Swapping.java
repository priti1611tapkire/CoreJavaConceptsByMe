import java.util.Scanner;

public class Swapping {
	public static void main(String[] args) {
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first No: ");
		int a=sc.nextInt();
		System.out.println("Enter Second No: ");
		int b=sc.nextInt();
		
		System.out.println("before swapping numbers: "+a+" "+ b);  
	      
	      temp = a;  
	       a = b;  
	       b = temp;  
	       System.out.println("After swapping: "+a+" "+b);  
	       System.out.println( );  
		
	}
	

}
