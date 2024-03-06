package com.learning.core.day3;
import java.util.Scanner;

public class D03P09 {
	public static boolean canFormCircle(String[] strings) {
        boolean[] visited = new boolean[strings.length];
        return canFormCircleFrom(strings, visited, 0, strings.length, "");
    }
    
   
    private static boolean canFormCircleFrom(String[] strings, boolean[] visited, int start, int remaining, String prev) {
        if (remaining == 0) {
            return prev.charAt(prev.length() - 1) == strings[0].charAt(0);
        }
        
        for (int i = 0; i < strings.length; i++) {
            if (!visited[i] && (prev.equals("") || prev.charAt(prev.length() - 1) == strings[i].charAt(0))) {
                visited[i] = true;
                if (canFormCircleFrom(strings, visited, i, remaining - 1, strings[i])) {
                    return true;
                }
                visited[i] = false;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
    	 String[] strings = {"abcd", "bcda", "dafg", "ghia"};
         System.out.println("Can form circle: " + canFormCircle(strings));
    }
}
