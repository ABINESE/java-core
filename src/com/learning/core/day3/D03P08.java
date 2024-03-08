package com.learning.core.day3;
import java.util.Scanner;

public class D03P08 {
	private static int longestPalindromicSubsequence(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

       
        for (int cl = 2; cl <= n; cl++) {
            for (int i = 0; i < n - cl + 1; i++) {
                int j = i + cl - 1;
                if (s.charAt(i) == s.charAt(j) && cl == 2) {
                    dp[i][j] = 2;
                } else if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]);
                }
            }
        }

       
        return dp[0][n - 1];
    }

  
    public static int minimumDeletionsToMakePalindrome(String s) {
        int n = s.length();
        return n - longestPalindromicSubsequence(s);
    }
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	String s=sc.nextLine()
;    	 System.out.println("Minimum number of deletions required to make a palindrome: " + minimumDeletionsToMakePalindrome(s));
    }
}
