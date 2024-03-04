package com.learning.core.day2;
import java.util.Scanner;

public class D02P08 {
	public static void main(String[] args)
	{
	System.out.println("Enter the L and R");
	Scanner sc=new Scanner(System.in);
	int l=sc.nextInt();
	int r=sc.nextInt();
	int sum=0;
	while(l<=r)
		{
		sum+=l;
		l++;
		}
	System.out.println(sum);
		}

}
