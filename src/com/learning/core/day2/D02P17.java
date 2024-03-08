package com.learning.core.day2;
import java.util.Scanner;
public class D02P17 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the maximum number: ");
	        int maxNumber = scanner.nextInt();

	        System.out.println("Generating prime numbers up to: " + maxNumber);
	        for (int num = 2; num <= maxNumber; num++) {
	            if (isPrime(num)) {
	                System.out.print(num + " ");
	            }
	        }
	    }

	    
	    private static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false; 
	        }
	        for (int i = 2; i <= number/2; i++) {
	            if (number % i == 0) {
	                return false; //
	            }
	        }
	        return true; 
	    }
}
