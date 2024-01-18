package com.project;

import java.util.Scanner;

//import javax.imageio.stream.IIOByteBuffer;

public class Test  {
	public static void main(String[] args) throws Exception{	  
		I i=new ServiceImplements();
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("Enter 1 for add data: ");
			System.out.println("Enter 2 for retrive Data");
			System.out.println("Enter 3 for delete Data: ");
			System.out.println("Enter 4 for update data");
			System.out.println("Enter 5 for exit ");
			int ch=sc.nextInt();

			switch(ch){ 
			case 1:
				i.addData();
				System.out.println("----Successfully----");
				break ;

			case 2:
				i.retriveData();
				System.out.println("----Successfully----");
				break ;

			case 3:
				i.deleteData();
				System.out.println("----Successfully----");
				break ;

			case 4:
				i.updateData();
				System.out.println("----Successfully----");
				break ;

			case 5:
				System.exit(0);

			default :
				System.out.println("---------------------------------");

			}

		}

	}
}
