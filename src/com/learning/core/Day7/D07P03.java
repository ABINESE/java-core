package com.learning.core.Day7;
import java.util.Stack;
import java.util.Scanner;
public class D07P03 {
public static String reverseString(String str) {
        
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
        	st.push(str.charAt(i));
        	
        }
        StringBuilder rev=new StringBuilder();
        while(!st.isEmpty())
        {
        	rev.append(st.pop());
        }
        return rev.toString();
    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String");
        String originalString = sc.nextLine();
        String reversedString = reverseString(originalString);

        System.out.println("Original string: " + originalString);
        System.out.println("Reversed string: " + reversedString);
    }
}
