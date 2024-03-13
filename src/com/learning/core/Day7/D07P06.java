package com.learning.core.Day7;
import java.util.Scanner;
import java.util.Stack;
public class D07P06 {
public static void main(String[] args)
{
	Stack<Integer> st=new Stack<>();
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of Elements");
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		st.push(sc.nextInt());
	}
	int min=Integer.MAX_VALUE;
	
	for(int i=0;i<n;i++)
	{
		int p=st.pop();
		if(p<min)
		{
			min=p;
		}
	}
	System.out.print("Minimum Value is "+min);
}
}
