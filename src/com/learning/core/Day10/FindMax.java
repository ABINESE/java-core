package com.learning.core.Day10;

public class FindMax {
	int max=Integer.MIN_VALUE;
public int Max(int arr[]){
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	return max;
	}
}
