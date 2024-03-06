package com.learning.core.day3;
import java.util.Scanner;


public class D03P01 {
	public static boolean isPlaindrome(String str) {
		String ori=str.toLowerCase();
		String rev="";
		for(int i=ori.length()-1;i>=0;i--)
		{
			rev+=ori.charAt(i);
		}
		return ori.equals(rev);
		
	} 
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 String input=sc.nextLine();
 System.out.println("The length is "+input.length());
 System.out.println("The lower case "+ input.toUpperCase());
 if (isPlaindrome(input)) {
     System.out.println("The string is a palindrome.");
 } 
 else {
     System.out.println("The string is not a palindrome.");
 }
 
}
}
