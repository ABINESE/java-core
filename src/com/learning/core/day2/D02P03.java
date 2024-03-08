package com.learning.core.day2;
import java.util.Scanner;
public class D02P03 {
public static void main (String [] args)
{
	
	Scanner scn=new Scanner(System.in);
	System.out.print("Enter the number a");
	int a=scn.nextInt();
	System.out.print("Enter the number b");
	int b=scn.nextInt();
	System.out.print("Enter the operator");
	char op=scn.next().charAt(0);
	switch(op)
	{
	case '+':
		System.out.println(a+b);
		break;
	case '-':
		if(a>b)
		System.out.println(a-b);
		else
		System.out.println(b-a);
		break;
	case '*':
		System.out.println(a*b);
		break;
	case'/':
		if(a!=0 || b!=0)
		{
			System.out.println(a/b);
			
		}
		else
			System.out.println("Undefined");
		break;
		
	}
	
}
}
