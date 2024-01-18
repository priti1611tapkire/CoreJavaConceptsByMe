package com.throwtask;
//	Q3. Write the program for custom exception.
//(if age is less than 18 print exception msg as "Not Eligible for voting" 	otherwise print "Welcome to voting").
public class VotingClass {

		public void voting(int age){  
			System.out.println("welcome to voting centre");
			if(age<18){
				ArithmeticException e=new ArithmeticException("Not Eligible for voting");
				throw e;
			    }
			else{
				System.out.println("Welcome to voting");
			    }
			System.out.println("your vote is valuble for nation");
		}  
		public static void main(String args[]){  
			VotingClass v=new VotingClass();
			try{
			v.voting(20);	
		     } 
			catch(ArithmeticException e){
				System.out.println("Catch Block:"+e.getMessage());
			}
			System.out.println("Thank you for your initiation");
	}



}
