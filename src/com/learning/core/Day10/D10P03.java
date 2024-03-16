package com.learning.core.Day10;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;
public class D10P03 {
	public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:/Users/ACAL/eclipse-workspace/MLA java course/src/sample.txt"))) {
           
            StudentData students = (StudentData)in.readObject();

                System.out.println(students);
            
        } catch (Exception e) {
            System.out.println("An error occurred during deserialization: " + e.getMessage());
        }
    }
}
