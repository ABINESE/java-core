package com.learning.core.day3;
import java.util.Scanner;
public class D03P04 {
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  int size=sc.nextInt();
  int[] arr=new int[size];
  for(int i=0;i<size;i++)
  {
	  arr[i]=sc.nextInt();
  }
  int minIndex=-1;
  for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
          
          if (arr[i] == arr[j]) {
              
              if (minIndex == -1 || minIndex > i) {
                  minIndex = i;
              }
          }
      }
  }
  System.out.print(minIndex);
	}
}
