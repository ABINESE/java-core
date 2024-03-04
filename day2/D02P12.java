package com.learning.core.day2;
import java.util.Scanner;

public class D02P12 {
public static void main(String[] args)
{
	System.out.println("Enter the number n");
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=n;i>=1;i--)
	{
		for(int s=1;s<=n-i;s++)
			System.out.print(" ");
		for(int j=i;j<=2*i-1;j++)
			System.out.print("*");
		for(int j=0;j<i-1;j++)
			System.out.print("*");
		System.out.println();
	}
	
}
}
