package com.learning.core.Day10;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
public class D10P02 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter Roll Number: ");
            int rollNumber = scanner.nextInt();
            System.out.print("Enter Name: ");
            String name = scanner.next();
            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            System.out.print("Enter Address: ");
            String ss = scanner.next();

            if (name.isEmpty() || ss.isEmpty()) {
                throw new ValidationException("None of the fields should be blank.");
            }

            StudentData studentData = new StudentData(rollNumber, name, age, ss);

            System.out.print("Do you want to write the data in the file? (yes/no): ");
            String response = scanner.next().trim();
            if (response.equalsIgnoreCase("yes")) {
                try(FileOutputStream fileOut = new FileOutputStream("C:/Users/ACAL/eclipse-workspace/MLA java course/src/sample.txt");
                ObjectOutputStream out = new ObjectOutputStream(fileOut)){
                out.writeObject(studentData);
                System.out.println(studentData);
                System.out.println("Serialized data is saved in sample.txt");
                }
            } else {
                System.out.println("Data not saved. Program terminated.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Age and Roll Number should be numeric.");
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
