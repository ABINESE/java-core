package com.learning.core.day2;
import java.util.Scanner;
public class D02P02 {
	public static void main(String [] args)
	{
   System.out.println("Enter the number");
   Scanner scn= new Scanner(System.in);
   int n=scn.nextInt();
   for(int i=2;i<=n;i=i+2)
   {
	   System.out.println(i);
   }
	}
}
