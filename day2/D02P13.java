package com.learning.core.day2;
import java.util.Scanner;

public class D02P13 {
public static void main(String[] args)
{
    System.out.println("Enter the number");
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();
    int f=1;
    while(n!=0)
    {
    	f=f*n;
    	n=n-1;
    }
    System.out.println(f);
}
}
