package com.learning.core.day3;
import java.util.Scanner;
public class D03P10 {
	public static int findLongestPrefixSuffix(String s) {
        int n = s.length();
        int maxLen = 0;

        for (int len = 1; len <= n / 2; len++) {
            String prefix = s.substring(0, len);
            String suffix = s.substring(n - len);
            if (prefix.equals(suffix)) {
                maxLen = len;
            }
        }

        return maxLen;
    }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(findLongestPrefixSuffix(str));
		
	}
}
