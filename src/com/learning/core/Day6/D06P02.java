package com.learning.core.Day6;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class D06P02 {
public static void main(String[] args)
{
	HashMap<String, String> phonebook=new HashMap<>();
	
	phonebook.put("Amal", "998787823");
	phonebook.put("Manvitha", "937843978");
	phonebook.put("Joseph", "7882221113");
	phonebook.put("Smith", "8293893311");
	phonebook.put("Kathe", "7234560011");
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Name");
	String name=sc.nextLine();
	for(Map.Entry<String, String> ph: phonebook.entrySet())
	{
		if(ph.getKey().equals(name))
		{
			System.out.print(ph.getValue());
		}
			
	}
}
}
