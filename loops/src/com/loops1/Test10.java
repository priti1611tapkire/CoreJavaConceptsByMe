package com.loops1;

public class Test10 {
	public static void main(String[] args) {
		int a=60;
		if(a<33){// 60<33...false
			System.out.println("candiadte fail");
		}
		else if (a>33 || a==60){// 60>33...true
			System.out.println("candidate pass");
		}
		else if(a>65 || a==74){
			System.out.println("candiadte in toplist");
		}
		else if( a==75 || a>75){
			System.out.println("Candidate in Distinction class");
		}
		else{
			System.out.println("Average student");
		}
	}
	

}
