package com.C;
import java.util.Scanner;

import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.Rbi;


public class Sbi implements Rbi {
	Account ac=new Account();
	Scanner sc=new Scanner(System.in);
	
	public void createAccount()
	{			
		System.out.println("Enter your Account Number");
		int a=sc.nextInt();
		ac.setAccNo(a);
		System.out.println("Enter your Name");
		String s=sc.next();
		ac.setName(s);
		System.out.println("Enter your Mobile Number");
		String m=sc.next();
		ac.setMobNo(m);
		System.out.println("Enter your Adhaar Number");
		String n=sc.next();
		ac.setAdharNo(n);
		System.out.println("Enter your Gender");
		String o=sc.next();
		ac.setGender(o);
		    			System.out.println("Enter your age");
				        int p=sc.nextInt();
				        int agecount=0;
		              if (p>18){
		            	  ac.setAge(p); 
		            	   agecount++;	            	 
		                   }
		               else{
		            	   System.out.println("your age must be greater than 18 years");
			            	  // System. exit(1); 
		                   }
		              if(agecount!=0){
      
				    	
						System.out.println("enter amount:  ");
						double q=sc.nextDouble();
						while(true){
						if(q>=500){
						ac.setBalance(q);  
			        	break;
						}
						 else{
							 System.out.println("enter amount rupees is greater than 500 rupees");
							 
						     }
						}
						System.out.println("your account created successfully");
						}
		              
	}
	public void displayAllDetails(){
		//int count=0;
		int val=+ac.getAccNo();
		if(val!=0){
		//	count++;
		System.out.println("Account No: "+ac.getAccNo());
		System.out.println("Name: "+ac.getName());
		System.out.println("Mobile no: "+ac.getMobNo());
		System.out.println("Adhar No: "+ac.getAdharNo());
		System.out.println("Gender: "+ac.getGender());
		System.out.println("Age No: "+ac.getAge());
		System.out.println("Balance: "+ac.getBalance());
		System.out.println("your all details");
		}
		else{
			System.out.println("INVALID INPUT..PLEASE CREATE YOUR ACCOUNT FIRST");
		}
	}
	public void depositeMoney()
	{
		int count=0;
		int val=+ac.getAccNo();
		     if(val!=0){
			count++;
		    System.out.println("Account No: "+ac.getAccNo());
	       	System.out.println("Deposite Amount: ");
	     	double r=sc.nextDouble();
		    double Newbal=r+ac.getBalance();
	     	ac.setBalance(Newbal);
	     	System.out.println("Your balance is successfully deposited");
		    }
		    else{
			System.out.println("INVALID INPUT..PLEASE CREATE YOUR ACCOUNT FIRST");
		    }
				
	}
	public void withdrawal()
	{
		
		//int count=0;
		int val=+ac.getAccNo();
		    if(val!=0){
			//count++;
		    System.out.println("Account No: "+ac.getAccNo());
		    System.out.println("Withdraw");
		    System.out.println("Withdrawl Amount: ");
		    double s=sc.nextDouble();
	      	double Newbaln=ac.getBalance()-s;
	     	    if (Newbaln<=500){
			    System.out.println("please maintain minimum balance in your account");
		        }
	           	else{
		        ac.setBalance(Newbaln);
		        System.out.println("Your balance is successfully debited from your account");
	         	System.out.println("Withdrawl Successfully");
	           	}
		        }
		   else{
			System.out.println("INVALID INPUT..PLEASE CREATE YOUR ACCOUNT FIRST");
		}
	//	}
	}
	public void balanceCheck()
	{
		//int count=0;
		int val=+ac.getAccNo();
		     if(val!=0){
			//count++;
		
		     System.out.println("Balance Check");
		     System.out.println("Newbal=" +ac.getBalance());
	   	}
		else{
			System.out.println("INVALID INPUT..PLEASE CREATE YOUR ACCOUNT FIRST");
		}
	
	}

}
