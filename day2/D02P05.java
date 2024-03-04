package com.learning.core.day2;
import java.util.Scanner;

public class D02P05 {
public static void main (String[] args)
{
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n%5==0)
		System.out.println(n+"is divisible by 5");
	else
		System.out.println(n+"  is not divisible by 5");
}
}

