package com.starpattern;
//2
public class A5 {
	public static void main(String[] args) {
		for(int i=0;i<6;i++){// 0<6...true>B //1<9...TRUE..>B
			
			for(int j=0; j<=i;j++){//B 0<=0...true...j=0+1=1<=0...false..>A...B...1<=0...true...
				System.out.print("* ");// * 
				//A
				//* *
			}
			System.out.println();//args.second line A
			}	
	}

}
