package com.braindata.bankmanagement.client;
import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.Rbi;
import com.C.Sbi;
import java.util.Scanner;


public class Test {
	public static void main(String[] args)
	{
		Rbi bank=new Sbi();
		Scanner sc=new Scanner(System.in);
		
		while(true){
			
			System.out.println("Press 1 for Creat Account No");
			System.out.println("Press 2 for Display All methods");
			System.out.println("Press 3 for Deplosite Money");
			System.out.println("Press 4 for withdrawl");
			System.out.println("Press 5 for Balance Check");
			System.out.println("Press 6 for Exit");
			System.out.println("Enter Function No do you want to perform");
			
			int op=sc.nextInt();	
		switch(op){
		case 1:
			
			bank.createAccount();
			break;
			
		case 2:
			bank.displayAllDetails();
			break;
			
		case 3:
			bank.depositeMoney();
			
			break;
			
		case 4:
			bank.withdrawal();
			break;
			
		case 5:
			bank.balanceCheck();
			break;
			
		case 6: 
		 System.exit(0);
		 
		 default:
			 System.out.println("Thank you");
		}
		}
	}
}

