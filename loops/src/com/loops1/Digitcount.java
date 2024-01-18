package com.loops1;
import java.util.Scanner;

public class Digitcount {
	public static void main(String[] args) {
		int sum=0, m, n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		m=s.nextInt();
		while(m>0){// 58972234>0...true...5397223>0..true....589722>0.. 58972>0... true....5897>0...589>0...53>0...5>0...0>0...false
			n=m%10;// 58972234%10...4> 589722%10....>3...>58972%10...>2..5397%10...2.5397%10...>7....539%10..>9...53%10...3
			sum=sum+n;//....sum=0+4=4....>sum=4+3=7...>sum=7+2=10..sum=10+2=12.sum=12+7=19 sum=19+9=28...sum=28+8=40 ...sum
			m=m/10;//....//58972234/10...>m=5897223/10...589722...m=58972/10...5897m=5897/10...m=589/10=...58/10...5 5/10...0
			
		}
		System.out.println("Sum of digits: "+sum);
	}
}



