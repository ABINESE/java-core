package com.learning.core.Day10;
import java.io.*;
import java.util.Scanner;
public class D10P01 {
	public static void main(String[] args) {
        
        
        File sourceFile = new File("sample.txt");
        File destinationFile = new File("sample2.txt");

        
        if (!sourceFile.exists()) {
            System.out.println("The source file does not exist: " + sourceFile);
            System.exit(1);
        }

        
        if (destinationFile.exists()) {
            System.out.print("The destination file exists. Do you want to overwrite? (Yes/No): ");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.nextLine().trim().toLowerCase();

            if (!response.equals("yes")) {
                System.out.println("Operation cancelled by the user.");
                System.exit(1);
            }
        }

       
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.err.println("Error occurred during file copying: " + e.getMessage());
        }
    }
}
