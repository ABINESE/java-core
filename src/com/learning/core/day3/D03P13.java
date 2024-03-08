package com.learning.core.day3;
import java.util.Scanner;
public class D03P13 {
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        String input = sc.nextLine();
	        
	        
	        String output = input.replace(" ", "%20");
	        System.out.println(output);
	 }
}
