package com.arraycheck;
import java.util.Scanner;

//import javax.swing.plaf.synth.SynthSpinnerUI;
public class A3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lenghth of array:  ");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		for(int i=0; i<size;i++){
			System.out.println(" Element at "+i+" th Index: ");
			a[i]=sc.nextInt(i);		
		}
		System.out.println("the elements of array: ");
		for(int i=0; i<a.length;i++){
			System.out.println(a[i]);
		}
		
	}
	

}
