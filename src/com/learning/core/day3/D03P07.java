package com.learning.core.day3;
import java.util.Scanner;

public class D03P07 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	
	String str=sc.nextLine();
	int n = str.length();
    
    
    int total = 1 << n; 
    
    for (int i = 0; i < total; i++) {
        String subsequence = "";
        
        for (int j = 0; j < n; j++) {
            
            if ((i & (1 << j)) > 0) {
                subsequence += str.charAt(j);
            }
        }
        
        System.out.println(subsequence);
    }
}
}
