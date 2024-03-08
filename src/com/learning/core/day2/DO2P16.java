package com.learning.core.day2;
import java.util.Scanner;
public class DO2P16 {
public static void main(String[] args)
{
	System.out.println("Enter the number ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int num1=0,num2=1;
	
	for(int i=1;i<=n;i++)
	{
		System.out.print(" "+ num1);
		int sum=num1+num2;
		num1=num2;
		num2=sum;
	}
	
}
}
