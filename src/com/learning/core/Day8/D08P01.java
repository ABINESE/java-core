package com.learning.core.Day8;
import java.util.Scanner;

class Queue{
	int front=-1;
	int rear=-1;
	int arr[];
	int n;
	public Queue(int n)
	{
		this.n=n;
		arr=new int[n];
	}
	public boolean isEmpty()
	{
		return front==-1 && rear==-1;
	}
	public boolean isFull()
	{
		return rear==n-1;
	}
	public void enqueue(int data)
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
	public int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return -1;
		}
		if(rear==front)
		{
			int ret=arr[front];
			rear=front=-1;
			return ret;
		}
		else {
			int ret=arr[front];
			front++;
			return ret;
		}
	}
	public int peek()
	{
		if(isEmpty())
		{
			System.out.print("Queue is Empty");
			return -1;
		}
		else
			return arr[front];
	}
}
public class D08P01 {
public static void main(String[] args)
{
	Queue q=new Queue(4);
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<4;i++)
	{
		q.enqueue(sc.nextInt());
	}
	q.dequeue();
	
	for(int i=0;i<3;i++)
	{
		System.out.print(q.peek()+" ");
		q.dequeue();
	}
	
}
}
