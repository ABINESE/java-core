package com.learning.core.Day6;
import java.util.Hashtable;
import java.util.Objects;
import java.util.Scanner;
public class D06P13 {
	public static void main(String[] args) {
Hashtable<Integer, Employee> employees=new Hashtable<>();
	
	employees.put(1001, new Employee(1001, "Analyst", "Daniel", "L&D"));
    employees.put(1002, new Employee(1002, "Thomas", "Tester", "Testing"));
    employees.put(1003, new Employee(1003, "Rober", "Product Manager", "Developement"));
    employees.put(1004, new Employee(1004, "Grace", "Tech Support", "HR"));
    employees.put(1005, new Employee(1005, "Charles", "QA Leading", "Testing"));
    int id=1006;
    Employee em=new Employee(1006,"Tom","Developer","IT");
    employees.put(id, em);
    
    System.out.print(employees.size());
    
    
	}
}
