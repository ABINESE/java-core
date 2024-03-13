package com.learning.core.Day8;
 class Queue1 {
	   int front = -1;
	   int rear = -1;
	   int arr[];
	   int n;
	   
	   public Queue1(int n)
	   {
		   this.n = n;
		   arr = new int[n];
	   }
	   
	   public boolean isFull()
	   {
		   return rear==n-1;
	   }
	   
	   public boolean isEmpty()
	   {
		   return front==-1 && rear==-1;
	   }
	   
	   public void enqueue(int data)
	   {
		   if(isFull())  // when queue is Full
		   {
			   System.out.println("Queue is Full");
		   }
		   else if(isEmpty())  // when first time we are inserting an element
		   {
			   rear = front = 0;
			   arr[rear] = data;
		   }
		   else  // when element is already present in queue
		   {
			   rear++;
			   arr[rear] = data;
		   }
	   }
	   
	   public int dequeue()
	   {
		   if(isEmpty())  // This is when queue is empty
		   {
			   System.out.println("Queue is Empty");
			   return -1;
		   }
		   else if(front==rear) // when queue has only 1 element left and front and rear points to same
		   {
			   int top = arr[front];
			   front = rear = -1;
			   return top;
		   }
		   else  // when elements are present and want to remove top one
		   {
			   int top = arr[front];
			   front ++;
			   return top;
		   }
		
	   }
	   
	   public int peek()
	   {
		   if(isEmpty())  // This is when queue is empty
		   {
			   System.out.println("Queue is Empty");
			   return -1;
		   }
		   else
		   {
			   int top = arr[front];
			   return top;
		   }
	   }
	   
	   public void display()
	   {
		   for(int i = this.front;i<=this.rear;i++)
		   {
			   System.out.println(arr[i]);
		   }
	   }
 }
public class D08P05 {
	 public static void main(String[] args) {
		 Queue1 queue = new Queue1(5);  
		 Queue1[]  arrQ = new Queue1[2];
		 Queue1 posQueue = new Queue1(5); 
		 Queue1 negQueue = new Queue1(5);  
		 arrQ[0] = posQueue;
		 arrQ[1] = negQueue;
		 queue.enqueue(10);
		 queue.enqueue(-3);
		 queue.enqueue(8);
		 queue.enqueue(-1);
		 queue.enqueue(-5);
		 while(!queue.isEmpty())
		 {
			 int data = queue.dequeue();
			 if(data>0)
			 {
				 posQueue.enqueue(data);
			 }
			 else
			 {
				 negQueue.enqueue(data);
			 }
		 }
		 
		 posQueue.display();
		 negQueue.display();
	}
}
