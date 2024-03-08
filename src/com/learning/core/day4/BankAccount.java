package com.learning.core.day4;

public class BankAccount 
{
int accNo;
String custName;
String accType;
float balance;

public BankAccount(int accNo, String custName, String accType, float balance)

{
	this.accNo=accNo;
	this.custName=custName;
	this.accType=accType;
	this.balance=balance;
}
public void deposit(float amt) throws NegativeAmmount
{
	if(amt>0)
	{
		balance+=amt;
	}
	else
		throw new NegativeAmmount("Please Enter valid Ammount");
}
public float getBalance() throws LowBalanceException
{
	if(balance<1000)
	{
		throw new LowBalanceException("Low Blance");
	}
	else
		return balance;
}

}
