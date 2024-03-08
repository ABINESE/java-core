package com.learning.core.day5;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class D05P02 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	List<String> l1=new ArrayList<String> ();
	System.out.print("Enter the Names");
	while(true)
	{
		String input=sc.nextLine();
		if("End".equals(input))
			break;
		l1.add(input);
	}
	System.out.println("Enter the name");
	String name=sc.nextLine();
	int f=0;
	for(String s:l1 )
	{
		if(s.equals(name))
			f=1;
	}
	if(f==1)
		System.out.println("Found");
		else
			System.out.print("Not found");
			
}
}
