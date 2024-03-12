package com.learning.core.Day6;
import java.util.HashMap;
import java.util.TreeSet;
class Book implements Comparable<Book>
{

	int bookid;
	String title;
	double price;
	String dateof;
	String author;
	
	public Book(int bookid, String title, double price, String dateof,String author)
	{
		this.bookid=bookid;
		this.title=title;
		this.price=price;
		this.dateof=dateof;
		this.author=author;
		
	}

	@Override
	public int compareTo(Book o) {
		 return Integer.compare(this.bookid, o.bookid);
		 	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int res= bookid*31;
		return res;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Book b=(Book) obj;
		return title.equals(b.title);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bookid + "    " + title + "   " + price + "    " + author + "     " + dateof;
	}
	
}
public class D06P03 {
public static void main(String[] args)
{
	TreeSet<Book> b=new TreeSet<>();
	
	b.add(new Book(1002, "Modern Mainframes", 150.0, "19/5/1997", "David"));
	b.add(new Book(1001, "Python Learning", 200.0, "2/2/2020", "Brown"));
	b.add(new Book(1003, "Java Programming", 230.0, "23/11/1984", "Gilad Bracha"));
    b.add(new Book(1004, "Read C++", 295.0, "19/11/1984", "Henry Harvin"));
    b.add(new Book(1005, ".Net Platform", 349.7, "6/3/1984", "Mark J. Price"));
    
    for(Book bk:b)
    {
    	System.out.println(bk.toString());
    }
	
}
}
