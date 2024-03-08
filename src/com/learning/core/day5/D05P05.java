package com.learning.core.day5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;
public class D05P05 {
public static void main(String[] args)
{
	 Product1 p1=new Product1("P001", "Maruti800");
	 Product1 p2=new Product1("P002", "Maruti Zen");
	 Product1 p3=new Product1("P003", "Maruti Den");
	 Product1 p4=new Product1 ("P004", "MarutiSwift");
	 
	 Set<Product1> s1=new HashSet<>();
	 s1.add(p4);
	 s1.add(p3);
	 s1.add(p2);
	 s1.add(p1);
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter the product Id");
	 String input=sc.nextLine();
	 Iterator<Product1> it = s1.iterator();
	 while(it.hasNext())
	 {
		 Product1 p=it.next();
		 if(input.equals(p.getProductId()))
				 {
			 it.remove();
				 }
	 }
	for(Product1 p:s1)
	{
		System.out.println(p);
	}
	 }
}
