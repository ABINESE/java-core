package com.learning.core.day2;
import java.util.Scanner;
public class D02P14 {
public static void main(String[] args)
{
   System.out.println("Enter the number");
   Scanner sc =new Scanner(System.in);
   int b=sc.nextInt();
   int p=sc.nextInt();
   int res=1;
  for(int i=1;i<=p;i++)
  {
	  res*=b;
  }
   System.out.println(res);
}
}
