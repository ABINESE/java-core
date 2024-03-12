package com.learning.core.Day6;
import java.util.Map;
import java.util.HashMap;
public class D06P01 {
public static void main(String[] args)
{
	HashMap <String ,String> phonebook=new HashMap<>();
	phonebook.put("Amal", "998787823");
	phonebook.put("Manvitha", "937843978");
	phonebook.put("Joseph", "7882221113");
	phonebook.put("Smith", "8293893311");
	phonebook.put("Kathe", "7234560011");
	
	for(Map.Entry<String, String> ph:phonebook.entrySet())
	{
		System.out.println(ph.getKey()+"  "+ph.getValue());
	}
	
	
}
}
