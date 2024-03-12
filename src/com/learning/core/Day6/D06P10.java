package com.learning.core.Day6;
import java.util.Hashtable;
import java.util.Objects;

class Employee {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", department='" + department + '\'' +
               ", designation='" + designation + '\'' +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Getters and Setters omitted for brevity
}


public class D06P10 {
	 public static void main(String[] args) {
	        Hashtable<Integer, Employee> employees = new Hashtable<>();

	        
	        employees.put(1, new Employee(1, "John Doe", "IT", "Developer"));
	        employees.put(2, new Employee(2, "Jane Doe", "HR", "Manager"));
	        employees.put(3, new Employee(3, "Jim Beam", "Finance", "Analyst"));
	        employees.put(4, new Employee(4, "Jill Stein", "IT", "Support Specialist"));

	       
	      
	        System.out.println(employees.isEmpty());
	    }
}
