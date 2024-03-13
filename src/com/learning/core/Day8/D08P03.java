package com.learning.core.Day8;
import java.util.Scanner;
class CircularQueue
{
	int front=-1;
	int rear=-1;
	int[] arr;
	int n;
	
	public CircularQueue(int n)
	{
		this.n=n;
		this.arr=new int[n];
	}
	public boolean isFull()
	{
		return (rear+1)%n==front;
	}
	public boolean isEmpty()
	{
		return front==-1 & rear==-1;
	}
	public void enqueue(int data)
	{
		if(isFull())
		{
			System.out.println("Queue is Full");
		}
		else if(isEmpty())
		{
			front=rear=0;
			arr[rear]=data;
			
		}
		else
		{
			rear=(rear+1)%n;
			arr[rear]=data;
		}
		
	}
	public int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Full");
			return -1;
		}
		else {
		int res=arr[front];
		front=(front+1)%n;
		return res;
		}
	}
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Full");
			return -1;
		}
		else {
		int res=arr[front];
		
		return res;
		}
	}
	}
public class D08P03 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println("Enyter the elements");
	CircularQueue  q=new CircularQueue(n);
	for(int i=0;i<n;i++)
	{
		q.enqueue(sc.nextInt());
	}
	q.dequeue();
	//q.dequeue();
	
	for(int i=0;i<n-1;i++)
	{
		System.out.print(q.peek()+" ");
		q.dequeue();
	}
}
}
