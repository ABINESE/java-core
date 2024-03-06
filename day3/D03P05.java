package com.learning.core.day3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class D03P05 {
	 public static List<List<Integer>> findCombinations(int[] arr, int k) {
	        Set<List<Integer>> results = new HashSet<>(); 
	        List<Integer> combination = new ArrayList<>();
	        backtrack(arr, k, 0, combination, results);
	        return new ArrayList<>(results);
	    }
	 private static void backtrack(int[] arr, int remain, int start, List<Integer> combination, Set<List<Integer>> results) {
	        if (remain < 0) {
	            return; 
	        } else if (remain == 0) {
	            results.add(new ArrayList<>(combination)); 
	        } else {
	            for (int i = start; i < arr.length; i++) {
	               
	                if (i > start && arr[i] == arr[i - 1]) continue; 
	                combination.add(arr[i]);
	                backtrack(arr, remain - arr[i], i + 1, combination, results); 
	                combination.remove(combination.size() - 1);
	            }
	        }
	    }
	public static void main(String[] args) {
        int[] arr = {10, 1, 2, 7, 6, 1, 5};
        int k = 2;
        List<List<Integer>> result = findCombinations(arr, k);
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }

   
   
}
