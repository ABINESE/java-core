package com.learning.core.day3;
import java.util.Scanner;
public class D03P02 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int a=sc.nextInt();
		int b=sc.nextInt();
		int f=0;
		int f1=0;
		for(int i:arr)
		{
			if(a==i)
				 f=1;
			if(b==i)
				f1=1;
		}
		if(f==1 && f1==1)
			System.out.println("Bingo");
		else
			System.out.println("Not found");
	}
	

}
