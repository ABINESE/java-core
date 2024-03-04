package com.learning.core.day2;
import java.util.Scanner;

public class D02P07 {
public static void main(String[] args)
{
	System.out.println("Enter the percentage");
	Scanner sc= new Scanner(System.in);
	int p=sc.nextInt();
	if(p>=60)
		System.out.println("A Grade");
	else if(p>=45)
		System.out.println("B Grade");
	else if(p>=35)
		System.out.println("C Grade");
	else
		System.out.println("Fail");
	}
}
