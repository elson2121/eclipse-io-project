package javautil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Javabuffered {

	 public static void main(String[] args) {
		
		 // Define the file path that you want to read
		 String filePath = "C:\\Users\\Ela\\Desktop\\javaLab\\labclass.txt"; 
		
		 // This String variable will temporarily hold each line read from the file
		 String line;
		 
		 // --- READING OPERATION using try-with-resources ---
		 
		 // The 'try-with-resources' statement automatically closes the resources (br and fr)
	     try (FileReader fr = new FileReader(filePath);
	    	  BufferedReader br = new BufferedReader(fr)) {
	    	 
	        System.out.println("📖 Reading content from the file:");
	        System.out.println("-------------------------------------");

	        // THE LOOP:
	        // 1. br.readLine() attempts to read the next line.
	        // 2. The result is assigned to the 'line' variable.
	        // 3. The loop continues AS LONG AS the result is NOT null (null means end of file).
	        while ((line = br.readLine()) != null) {
	            System.out.println("   " + line);
	        }
	        
	        System.out.println("-------------------------------------");
	        System.out.println("✅ End of file reached and processing complete.");
	        
	    } catch (IOException e) {
	    	 // This exception handler catches any errors during file access or reading
	         System.err.println("❌ ERROR: Could not read the file at: " + filePath);
	         System.err.println("Details: " + e.getMessage());
	    }
	}
}