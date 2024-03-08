package com.learning.core.day5;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;


class Product1{
	String ProductId;
	String ProductName;
	public Product1(String productId, String productName) {
		super();
		this.ProductId = productId;
		this.ProductName = productName;
	}
	 String getProductId() {
        return ProductId;
    }
    
     String getProductName() {
        return ProductName;
    }
	@Override
	public boolean equals(Object obj) {
		Product product=(Product) obj;
		return ProductId.equals(product.ProductId) && ProductName.equals(product.ProductName);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.ProductId+" "+this.ProductName;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	
	
	
}
public class D05P04 {
	public static void main(String[] args)
	 {
		 Product1 p1=new Product1("P001", "Maruti800");
		 Product1 p2=new Product1("P002", "Maruti Zen");
		 Product1 p3=new Product1("P003", "Maruti Den");
		 Product1 p4=new Product1 ("P004", "MarutiSwift");
		 
		 Set<Product1> s1=new HashSet<>();
		 s1.add(p4);
		 s1.add(p3);
		 s1.add(p2);
		 s1.add(p1);
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the product Id");
		 
		 String input=sc.nextLine();
		 System.out.println("Enter the Product Name");
		 String input1=sc.nextLine();
		 int f=0;
		 for(Product1 p: s1)
		 {
			if(p.getProductId().equals(input) && p.getProductName().equals(input1))
			{
				f=1;
			}
		 }
		 if(f==1)
			 System.out.print("Product Found");
		 else
			 System.out.print("Product Not Found");
			 
	 }
}
