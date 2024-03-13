package com.learning.core.Day7;
import java.util.Scanner;

class Node
{
	int value;
	Node next; //reference type
}

 class LinkedListStack 
{
  Node head;
  
  public LinkedListStack() 
  {
	head = null;
  }
  
  public boolean isEmpty()
  {
	  return(head==null);
  }
  
  public void push(int data)
  {
	  Node extraNode = head;
	  head = new Node();
	  head.value = data;
	  head.next = extraNode;
  }
  
  public int pop()
  {
	  if(isEmpty())
	  {
		  System.out.println("Stack is Empty");
		  return -1;
	  }
	  else
	  {
		  int topValue = head.value;
		  head = head.next;
		  return topValue;
	  }
  }
  
  public int peek()
  {
	  if(isEmpty())
	  {
		  System.out.println("Stack is Empty");
		  return -1;
	  }
	  else
	  {
		  return head.value;
	  }
  }
}
public class D07P02 {
	public static void main(String[] args) {
		   LinkedListStack lls = new LinkedListStack();
		   
		  
		   
		   lls.push(10);
		   lls.push(20);
		   lls.push(30);
		   lls.push(40);
		   lls.push(50);
		   
		   
		   System.out.println(lls.pop()); // 15 element and size becomes 4
		   System.out.println(lls.pop());
		   System.out.println(lls.pop());
		   System.out.println(lls.pop());
		   System.out.println(lls.pop());
		   System.out.println(lls.pop());
		   
		   
		  
	}
}
