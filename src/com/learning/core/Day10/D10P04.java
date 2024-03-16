package com.learning.core.Day10;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.io.*;
public class D10P04 {
	public static void main(String[] args) {
        File inputFile = new File("C:/Users/ACAL/eclipse-workspace/MLA java course/src/sample.txt");
        File outputFile = new File("C:/Users/ACAL/eclipse-workspace/MLA java course/src/sample2.txt");

        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {
            
            int content;
            while ((content = fis.read()) != -1) {
                fos.write(content);
            }
            System.out.println("File copied successfully.");
            
        } catch (FileNotFoundException e) {
            System.err.println("An error occurred: The file was not found. " + e.getMessage());
        } catch (IOException e) {
            System.err.println("An error occurred during the file copy operation: " + e.getMessage());
        }
    }
}
