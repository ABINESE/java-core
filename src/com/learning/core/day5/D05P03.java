package com.learning.core.day5;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;


class Product{
	String ProductId;
	String ProductName;
	public Product(String productId, String productName) {
		super();
		this.ProductId = productId;
		this.ProductName = productName;
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
public class D05P03 {
 public static void main(String[] args)
 {
	 Product p1=new Product("P001", "Maruti800");
	 Product p2=new Product("P002", "Maruti Zen");
	 Product p3=new Product("P003", "Maruti Den");
	 Product p4=new Product("P004", "MarutiSwift");
	 
	 Set<Product> s1=new HashSet<>();
	 s1.add(p4);
	 s1.add(p3);
	 s1.add(p2);
	 s1.add(p1);
	 
	 for(Product p: s1)
	 {
		System.out.println(p); 
	 }
 }
}
