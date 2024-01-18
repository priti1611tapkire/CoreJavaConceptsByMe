package com.alphabet;
//5
public class A3 {
	public static void main(String[] args) {
		
	
	char i;
	for ( i='A'; i<='E';i++){// A>=E...TRUE A=A+1=B>=E...TRUE
		for(char j='A';j<=i; j++){// A<=A...TRUE  J=A+1=B<=I...FALSE outside the loop j=B<=B..true 
			System.out.print(i);// A 
			// B B
		}
		System.out.println();// LINE CHANGE
	}
	
}

}
