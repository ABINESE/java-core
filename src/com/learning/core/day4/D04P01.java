package com.learning.core.day4;

public class D04P01 {
public static void main(String[] args) throws NegativeAmmount, LowBalanceException
{
	BankAccount bank=new BankAccount(123, "jhon","Saving", 900);
			float b=0;
		
			 try {
		            bank.deposit(500);
		            System.out.println("Deposit successful. Current balance: " + bank.getBalance());
		        } catch (NegativeAmmount e) {
		            System.err.println("Error during deposit: " + e.getMessage());
		        }

		        try {
		            float balance = bank.getBalance();
		            System.out.println("Current balance: " + balance);
		        } catch (LowBalanceException e) {
		            System.err.println("Error checking balance: " + e.getMessage());
		        }

		        // Example of depositing a negative amount to trigger IllegalArgumentException
		        try {
		            bank.deposit(-100);
		        } catch (NegativeAmmount e) {
		            System.err.println("Error during deposit: " + e.getMessage());
		        }
}
}
