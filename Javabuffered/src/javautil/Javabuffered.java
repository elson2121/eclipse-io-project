package javautil;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Javabuffered {

	 public static void main(String[] args) {
		
		 // Define the file path and name together, pointing to a file (not a folder)
		 String filePath = "C:\\Users\\Ela\\Desktop\\javaLab\\labclass.txt"; 

	    try {
	        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
	        
	        bw.write("this is our first text file");
	        bw.newLine();
	        bw.write("Hello BufferedWriter");
	        bw.close();
	        
	        System.out.println("File is created successfully at: " + filePath);
	        
	    } catch (IOException e) {
	    	// This is where you handle errors like "file not found" or "permission denied"
	        System.err.println("An error occurred while writing the file: " + e.getMessage());
	        // e.printStackTrace(); // Optional: uncomment this line for full error details
	    }
	}
}