package com.learning.core.Day10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class D10P06 {
public static void main(String[] args) {

	try {
		BufferedWriter fileWriter=new BufferedWriter(new FileWriter("DavidEnglish.txt"));
		fileWriter.write("English language will allow you to communicate effectively with people from all over the world");
		fileWriter.close();
		fileWriter=new BufferedWriter(new FileWriter("DavidScience.txt"));
		fileWriter.write("Science is study of nature and behavioral of natural things and the knowledge we obtain them");
		fileWriter.close();
		fileWriter=new BufferedWriter(new FileWriter("DavidComputer.txt"));
		fileWriter.write("Computer is electronic data, that machine takes as data input , process it and gave output");
		fileWriter.close();
		fileWriter=new BufferedWriter(new FileWriter("DavidNotes.txt"));
		BufferedReader bufferReader = new BufferedReader(new FileReader("DavidEnglish.txt"));
		String line;
		StringBuilder sb = new StringBuilder();
		while((line = bufferReader.readLine())!=null)
			sb.append(line);
		sb.append("\n");
		bufferReader.close();
		bufferReader = new BufferedReader(new FileReader("DavidScience.txt"));
		while((line = bufferReader.readLine())!=null)
			sb.append(line);
		sb.append("\n");
		bufferReader.close();
		bufferReader = new BufferedReader(new FileReader("DavidComputer.txt"));
		while((line = bufferReader.readLine())!=null)
			sb.append(line);
		sb.append("\n");
		bufferReader.close();
		fileWriter.write(sb.toString());
		fileWriter.close();
		
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}
