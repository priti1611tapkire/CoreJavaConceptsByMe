package com.numberpattern;
// lowercase indicates flow & cycles of programs a-s
public class Num1 {
	public static void main(String[] args) {
		for (int i=1; i<=5;i++){//a i=1<5...true..e...i=1+1=2...true ...i=i=2+1=3...true m=3+1=4<=5...true q=4+1=5...true
			for(int j=1;j<=5;j++){//b...i= 1>>>j=1<=5...true..1.j=1+1=2<=5...true...1...j=2<=5...true.j=2+1=3<=5..true...j=3+1=4<=5...true...j=4+1=5<=5...true...j=5+1=6<=5...false
				// f    i=2>>> /i= 1>>>j=1<=5...true..1.j=1+1=2<=5...true...1...j=2<=5...true.j=2+1=3<=5..true...j=3+1=4<=5...true...j=4+1=5<=5...true...j=5+1=6<=5...false
				// j  i=3>>/i= 1>>>j=1<=5...true..1.j=1+1=2<=5...true...1...j=2<=5...true.j=2+1=3<=5..true...j=3+1=4<=5...true...j=4+1=5<=5...true...j=5+1=6<=5...false
				//n   i=4>>/i= 1>>>j=1<=5...true..1.j=1+1=2<=5...true...1...j=2<=5...true.j=2+1=3<=5..true...j=3+1=4<=5...true...j=4+1=5<=5...true...j=5+1=6<=5...false
				//r  i=5>>/i= 1>>>j=1<=5...true..1.j=1+1=2<=5...true...1...j=2<=5...true.j=2+1=3<=5..true...j=3+1=4<=5...true...j=4+1=5<=5...true...j=5+1=6<=5...false
				
				System.out.print(i);// c.. 11111
				// g..22222
				//  k. 33333
				// o. 44444
				// r 55555
			}
			System.out.println();//d....second line h l p s
		}
	}

}
