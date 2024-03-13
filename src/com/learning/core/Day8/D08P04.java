package com.learning.core.Day8;
import java.util.Scanner;
class QueueSt{
      int front=-1;
	int rear=-1;
	String arr[];
	int n;
	public QueueSt(int n)
	{
		this.n=n;
		arr=new String[n];
	}
	public boolean isEmpty()
	{
		return front==-1 && rear==-1;
	}
	public boolean isFull()
	{
		return rear==n-1;
	}
	public void enqueue(String data)
	{
		if(isFull())
		{
			System.out.println("Queue is Full");
		}
		else if(isEmpty())
		{
			front=0;
			rear=0;
			arr[rear]=data;
		}
		else
		{
			rear++;
			arr[rear]=data;
		}
	}
	public String dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return "";
		}
		if(rear==front)
		{
			String ret=arr[front];
			rear=front=-1;
			return ret;
		}
		else {
			String ret=arr[front];
			front++;
			return ret;
		}
	}
	public String peek()
	{
		if(isEmpty())
		{
			System.out.print("Queue is Empty");
			return "";
		}
		else
			return arr[front];
	}
}
public class D08P04 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	QueueSt q=new QueueSt(n);
	for(int i=0;i<n;i++)
	{
		q.enqueue(sc.nextLine());
	}
	System.out.print(q.isEmpty());
	
}
}
