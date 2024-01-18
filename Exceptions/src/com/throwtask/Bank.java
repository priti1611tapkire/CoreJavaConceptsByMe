package com.throwtask;

public class Bank{
double amount;
double bal;
	void withdraw(double amount){
		if (amount> bal){
			throw new InsufficiantAmountException();
		}
	}
}
