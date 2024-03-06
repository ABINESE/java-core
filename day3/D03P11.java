package com.learning.core.day3;
import java.util.Scanner;
public class D03P11 {
	public static boolean canSplitIntoFourDistinctStrings(String s) {
        int n = s.length();
        
      
        for (int i = 1; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    String first = s.substring(0, i);
                    String second = s.substring(i, j);
                    String third = s.substring(j, k);
                    String fourth = s.substring(k, n);
                    
                    
                    if (!first.equals(second) && !first.equals(third) && !first.equals(fourth)
                        && !second.equals(third) && !second.equals(fourth) && !third.equals(fourth)) {
                        return true;
                    }
                }
            }
        }
        
        return false;
	}
        public static void main(String[] args)
        {
        	Scanner sc=new Scanner(System.in);
    		String str=sc.nextLine();
    		System.out.println(canSplitIntoFourDistinctStrings(str));
        }
    }

