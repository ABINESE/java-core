package com.learning.core.day2;
import java.util.Scanner;

public class D02P06 {
public static void main(String[] args)
{
	Scanner scn= new Scanner(System.in);
	System.out.println("Enter the day");
	int d= scn.nextInt();
	if(d==1)
		System.out.println("Monday");
	else if(d==2)
		System.out.println("Tuesday");
	else if(d==3)
		System.out.println("Wednesday");
	else if(d==4)
		System.out.println("Thursday");
	else if(d==5)
		System.out.println("Friday");
	else if(d==6)
		System.out.println("Saturday");
	else if(d==7)
		System.out.println("Sunday");
	else
	    System.out.println("Invalid Input");
	
	
	}
}
