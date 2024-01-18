package comex;

import java.util.Scanner;

public class CustomizeException {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		if(age<18){
			throw new AgeNotValidEx("i apologize pls wait more for some time for voting");
		}
		else {
			throw new AgeValidException("plz continue");
		}
	
	}
}
