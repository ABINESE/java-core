package com.learning.core.Day7;

class Stack
{
	int n;
	String arr[];
	int top;
	
	public Stack(int n)
	{
		this.n=n;
		this.arr=new String[n];
		this.top=-1;
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
	public boolean isFull()
	{
		return top==n-1;
	}
	public void push(String data)
	{
		if(isFull())
			System.out.println("Stack is Full");
		else
		{
			top++;
			arr[top]=data;
		}
		
	}
	public String pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
			return " ";
		}
		else
		{
			String value=arr[top];
			top--;
			return value;
		}
	}
	public String peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
			return "";
		}
		else
		{
			
			
			return arr[top];
		}
	}
	
//	public int max()
//	{
//		int max=0;
//		if(!isEmpty())
//		{
//			System.out.print("Stack is Empty");
//			return -1;
//		}
//		else
//		{
//			for(int i=0;i<n;i++)
//			{
//				if(arr[i]>max)
//					max=arr[i];
//			}
//		}
//	}
	public void reverse()
	{
		if(isEmpty())
		{
			System.out.print(pop()+" ");
		}
		else
		{
			String[] rev= new String[arr.length];
			int id=0;
			while(isEmpty())
			{
				String temp=pop();
				rev[id]=temp;
				id++;
				
			}
			
			for(int i=0;i<id;i++)
			{
				push(rev[i]);
			}
		}
	}
	public void display()
	{
		while(!isEmpty())
		{
			System.out.print(pop()+" ");
		}
	}
}

public class D07P01 {
public static void main(String[] args)
{
	Stack st=new Stack(4);
	st.push("Hello");
	st.push("world");
	st.push("java");
	st.push("Programming");
	
	
	st.pop();
	st.reverse();
	st.display();
	
}
}
