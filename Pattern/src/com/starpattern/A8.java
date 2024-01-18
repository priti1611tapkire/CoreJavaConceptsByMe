package com.starpattern;

public class A8 {
	public static void main(String[] args) {
	    
        for(char i='A'; i<'E'; i++) // outer loop for rows...
        { 
          char n='A';
            for(int j='A'; j<='E'; j--) // inner loop for rows// 
            { 
                 
                System.out.print(n); // 1
                n++;
            } 
            System.out.println(); //next line
        } 
}

}
