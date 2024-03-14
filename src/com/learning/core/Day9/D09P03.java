package com.learning.core.Day9;

import java.util.Scanner;

public class D09P03 {
public static boolean LinearSearch(int arr[], int key)
{
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==key)
			return true;
	}
	return false;
}

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the number of elements");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter The Numbers");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter Required Number");
	int key=sc.nextInt();
	if(LinearSearch(arr, key))
	{
		System.out.print("Element is Present");
	}
	else
		System.out.print("Element is Not Present");
		
	
}
}
