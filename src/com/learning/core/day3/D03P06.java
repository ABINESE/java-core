package com.learning.core.day3;
import java.util.Scanner;

public class D03P06 {
public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
   String str=sc.nextLine();
   int n=sc.nextInt();
   int count = 0;
  String ans="";
   for (int i = str.length() - 1; i >= 0; i--) {
       char ch = str.charAt(i);
       
       if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
           ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
           count++;
           ans+=ch;
           if (count == n) {
               break;
           }
       }
   }
   if(count>n)
	   System.out.println("Mismatch in vowel");
   else
	   System.out.println(ans);
}
}
