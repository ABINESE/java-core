package com.learning.core.day1;

import java.util.Scanner;

public class D01P01 {
static Book createBooks()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter book name");
	String name=sc.nextLine();
	System.out.println("Enter the book price");
	double price= sc.nextDouble();
	Book book=new Book();
	book.setBook_title(name);
	book.setBook_price(price);
	return book;
	}
static void showBooks(Book book)
{
	System.out.println("Boot title is "+ book.getBook_title()+" and price "+ book.getBook_price());
	
	}
public static void main(String [] args)
{
	showBooks(createBooks());
	}
}
