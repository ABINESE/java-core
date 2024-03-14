package com.learning.core.Day9;
import java.io.*;
import java.util.*;
public class D09P02 {
public static void merge(int arr[], int lb, int mid, int hb)
{
	int n1=mid-lb+1;
	int n2=hb-mid;
	
	int L[]=new int[n1];
	int R[]=new int[n2];
	
	
	for(int i=0;i<n1;i++)
	{
		L[i]=arr[lb+i];
	}
	for(int j=0;j<n2;j++)
	{
		R[j]=arr[mid+j+1];
	}
	int k=lb;
	int i=0;
	int j=0;
	while(i<n1 && j<n2)
	{
		if(L[i]<=R[j])
		{
			arr[k]=L[i];
			i++;
			
		}
		else
		{
			arr[k]=R[j];
			j++;
		
		}
		k++;
		
	}
	while(i<n1)
	{
		arr[k]=L[i];
		i++;
		k++;
	}
	while(j<n2)
	{
		arr[k]=R[j];
		j++;
		k++;
	}
}
public static void Mergesort(int arr[], int lb, int hb)
{
  if(lb<hb) {
  int mid=(lb+(hb-1))/2;
  Mergesort(arr,lb,mid);
  Mergesort(arr,mid+1,hb);
  
  merge(arr,lb,mid,hb);
  }
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
	Mergesort(arr,0,n-1);
	for(int i=0;i<n;i++)
	{
		System.out.println(arr[i]);
	}
	
}
}
