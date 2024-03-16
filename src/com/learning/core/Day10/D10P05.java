package com.learning.core.Day10;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class D10P05 {
  public static void main(String[] args) {
	 try {
		 Scanner scanner = new Scanner(System.in);
		 String input = scanner.nextLine();
		 File file = new File("C:/Users/ACAL/eclipse-workspace/MLA java course/src/io.txt");
		 FileWriter fileWriter = new FileWriter(file);
		 fileWriter.write(input);
		 fileWriter.close();
		 System.out.println(file.length()/(1024.0)+" (KB)");
		 BufferedReader br = new BufferedReader(new FileReader(file));
		 String line;
		 StringBuilder sb = new StringBuilder();
		 while((line=br.readLine())!=null)
			 sb.append(line);
		 br.close();
		 System.out.println(sb.toString());
		 if(file.delete()) {
			 System.out.println("Deleted File : "+file.getName());
		 }
		 else
			 System.out.println("File : "+file.getName()+"ot deleted");
	  }catch(Exception e) {
		  System.out.println(e.getMessage());
	  }
	 
  }
}
