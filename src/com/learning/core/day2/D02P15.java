package com.learning.core.day2;
import java.util.Scanner;
public class D02P15 {
public static void main(String[] args)
{
 System.out.println("Enter the Number");
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int p=0,ne=0,z=0;
 
 for(int i=0;i<n;i++)
 {
	 int num=sc.nextInt();
	 if(num>0)
		 p++;
	 else if(num<0)
		 ne++;
	 else
		 z++;
	 }
 System.out.println("Count of positive " +p);
 System.out.println("Count of negative " +ne);
 System.out.println("Count of zero " +z);
}

}
