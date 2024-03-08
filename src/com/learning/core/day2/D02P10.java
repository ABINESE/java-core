package com.learning.core.day2;
import java.util.Scanner;

public class D02P10 {
public static void main(String[] args)
{
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int d=0;
	while(n!=0)
	{
		int r=n%10;
		d=(d*10)+r;
		n=n/10;
		
	}
	System.out.println(d);
	}
}
