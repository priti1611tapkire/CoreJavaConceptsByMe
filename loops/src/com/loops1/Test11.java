package com.loops1;
//do while ithe conditions false hoyeparyant execution/itrations chalu rahtat
public class Test11 {
	public static void main(String[] args) {
		int x=1;
		int sum=0;
		do{
			sum=sum+x;// sum=0+1=1...>sum=1,...x=2..>sum=1+2=3., x=3...> sum=1+3=4, x=4...>sum=1+4=5...x=5 sum=1+5=6>>>x=10 sum=1+9=10
			x=x+1;// x=1+1=2...x=2, ....x=2+1=3...>x=3, ....x=3...>x=3+1=4, x=4...x=4+1=5, x=5 x=5+1=6,>>> x=8 x=8+1=9>>> x=10 x=1+10=11
		}
		while(x<=10);{//x=2... 2<=10...true, x=3....3<=10...true...x=4<10...true...x=5<=10...true x=6<=10 >>> x=9<=10....x=11<=10...false
			System.out.println("Sum of all first 10 nos:  "+sum);// 
		}
		}
}


