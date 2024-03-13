package com.learning.core.Day8;
import java.util.Scanner;
class Node{
	int data;
	Node next;
	public Node(int data)
	{
		this.data=data;
	}
}
class LinkedQueue
{
	Node front, rear;
	public void enqueue(int data)
	{
		if(front==null)
		{
			rear=new Node(data);
			front=rear;
		}
		else
		{
			Node extraNode=new Node(data);
			rear.next=extraNode;
			rear=extraNode;
		}
		
	}
	public int dequeue()
	{
		if(front==null)
		{
			System.out.println("Queue is Empty");
			return -1;
		}
		else
		{
			int res=front.data;
			front=front.next;
			return res;
		}
	}
	public int peek()
	{
		if(front==null)
		{
			System.out.println("Queue is Empty");
			return -1;
		}
		else
		{
			int res=front.data;
			//front.next=front;
			return res;
		}
	}
}
public class D08P02 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println("Enyter the elements");
	LinkedQueue q=new LinkedQueue();
	for(int i=0;i<n;i++)
	{
		q.enqueue(sc.nextInt());
	}
	q.dequeue();
	q.dequeue();
	
	for(int i=0;i<n-2;i++)
	{
		System.out.print(q.peek()+" ");
		q.dequeue();
	}
	
}
}
