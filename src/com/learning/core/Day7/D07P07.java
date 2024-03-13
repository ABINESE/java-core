package com.learning.core.Day7;
import java.util.Stack;
import java.util.Scanner;
public class D07P07 {
	public static void main(String[] args) {
	Stack<Integer> st=new Stack<>();
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of Elements");
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		st.push(sc.nextInt());
	}
	if(st.pop()%2==0)
	{
		System.out.print(true);
	}
	else
		System.out.print(false);	
	}
}
