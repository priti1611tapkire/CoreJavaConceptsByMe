package com.loops1;
// 2*1=2...2*10=20 table 
public class Test13 {
	public static void main(String[] args) {
		
			 int num=0;
			for(int i=1; i<=10;i++)// i=1 ...i=1+1=2, i= 1+2=3>>>...i=9+1=10.... i= 10+1=11...i=11<=10...false
			{
			 num=i*2;// i=1 num=1*2=2..>i=2..num=2*2=4...>i=3...num=2*3=6>>>> i=9 num=2*9=18;..> i=10, num=2*10=20
			System.out.println("2*"+i+"="+num);// 2*1=2.,2*2=4, 2*3=6...>>> 2*9=18, 2*10=20....
			}
	}

}

