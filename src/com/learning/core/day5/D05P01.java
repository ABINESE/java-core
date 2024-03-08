package com.learning.core.day5;

import java.util.Random;


class Employee {
 String name;
 long phoneNo;
 String passportNo;
 int licenseNo;
 String panCardNo;
 int voterId;
 int employeeId;

 
 public Employee(String name, long phoneNo, int employeeId, String passportNo) {
     this.name = name;
     this.phoneNo = phoneNo;
     this.employeeId = employeeId;
     this.passportNo = passportNo;
 }

 public Employee(String name, long phoneNo, int employeeId, int licenseNo, String panCardNo) {
     this.name = name;
     this.phoneNo = phoneNo;
     this.employeeId = employeeId;
     this.licenseNo = licenseNo;
     this.panCardNo = panCardNo;
 }

 public Employee(String name, long phoneNo, int employeeId, int voterId, int licenseNo) {
     this.name = name;
     this.phoneNo = phoneNo;
     this.employeeId = employeeId;
     this.voterId = voterId;
     this.licenseNo = licenseNo;
 }
}


class Student {
 String name;
 long phoneNo;
 String passportNo;
 int licenseNo;
 String panCardNo;
 int voterId;

 
 public Student(String name, long phoneNo, String passportNo) {
     this.name = name;
     this.phoneNo = phoneNo;
     this.passportNo = passportNo;
 }

 public Student (String name, long phoneNo, int licenseNo, String panCardNo) {
     this.name = name;
     this.phoneNo = phoneNo;
     this.licenseNo = licenseNo;
     this.panCardNo = panCardNo;
 }

 public Student(String name, long phoneNo, int voterId, int licenseNo) {
     this.name = name;
     this.phoneNo = phoneNo;
     this.voterId = voterId;
     this.licenseNo = licenseNo;
 }
}

//Define the generic Register class
class Register<T> {
 String registerId;

 // Method to generate registration id
 public String generateRegisterId(int n) {
     String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
     StringBuilder registerIdBuilder = new StringBuilder();
     Random rnd = new Random();
     while (registerIdBuilder.length() < n) { // length of the random string.
         int index = (int) (rnd.nextFloat() * chars.length());
         registerIdBuilder.append(chars.charAt(index));
     }
     registerId = registerIdBuilder.toString();
     return registerId;
 }
 
 // Method to display user details
 public void display(T user) {
     if (user instanceof Employee) {
         Employee emp = (Employee) user;
         System.out.println(registerId + " " + emp.name + " " + emp.phoneNo + " " + emp.employeeId);

         if (emp.passportNo != null) {
             System.out.println(emp.passportNo);
         } else {
             System.out.println(emp.licenseNo + " " + (emp.panCardNo != null ? emp.panCardNo : emp.voterId));
         }
     } else if (user instanceof Student) {
         Student std = (Student) user;
         System.out.println(registerId + " " + std.name + " " + std.phoneNo);
         if (std.passportNo != null) {
             System.out.println(std.passportNo);
         } else {
             System.out.println(std.licenseNo + " " + (std.panCardNo != null ? std.panCardNo : std.voterId));
         }
     }
 }
}

//Define the Tester class to demonstrate the working
public class D05P01 {
 public static void main(String[] args) {
     Register<Employee> employeeRegister = new Register<>();
     Employee employee = new Employee("Arun", 9123456780L, 1101, "LA78833DG");
     System.out.println("Employee Registration:");
     String employeeRegId = employeeRegister.generateRegisterId(7);
     employeeRegister.display(employee);

     Register<Student> studentRegister = new Register<>();
     Student student = new Student("Joseph", 9123412780L, "SJLD1717K");
     System.out.println("\nStudent Registration:");
     String studentRegId = studentRegister.generateRegisterId(7);
     studentRegister.display(student);
 }
}