package com.learning.core.day3;
import java.util.Scanner;
import java.util.Arrays;
public class D03P03 {
public  static void  main(String[] args)
{
	int[] arr=new int[18];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<15;i++)
	{
		arr[i]=sc.nextInt();
	}
	int sum=0;
	int small=arr[0];
	for(int i=0;i<15;i++)
	{
		sum+=arr[i];
		if(arr[i]<small)
			small=arr[i];
	}
	arr[15]=sum;
	arr[16]=sum/15;
	arr[17]=small;
	System.out.println(Arrays.toString(arr));
	}
}
