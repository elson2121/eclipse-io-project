import java.io.*;

public class DataStreamHomework {

    public static void main(String[] args) {
        // 1. Define the data you want to write
        boolean myBoolean = true;
        int myInteger = 42;
        double myDouble = 3.14159;
        
        // The name of the file to write to
        String fileName = "data.bin";

        // --- PART 1: WRITING DATA (DataOutputStream) ---
        System.out.println("--- WRITING DATA ---");
        System.out.println("Writing: Boolean=" + myBoolean + ", Int=" + myInteger + ", Double=" + myDouble);
        
        try (
            // Chain the DataOutputStream to a FileOutputStream for writing to a file
            FileOutputStream fileOut = new FileOutputStream(fileName);
            DataOutputStream dataOut = new DataOutputStream(fileOut);
        ) {
            // Write the data in a specific order
            dataOut.writeBoolean(myBoolean);
            dataOut.writeInt(myInteger);
            dataOut.writeDouble(myDouble);
            
            System.out.println("Data successfully written to " + fileName);

        } catch (IOException e) {
            // Handle any file or stream errors
            System.err.println("Error writing data: " + e.getMessage());
        }

        System.out.println("\n--------------------");
        
        // --- PART 2: READING DATA (DataInputStream) ---
        System.out.println("--- READING DATA ---");
        
        try (
            // Chain the DataInputStream to a FileInputStream for reading from a file
            FileInputStream fileIn = new FileInputStream(fileName);
            DataInputStream dataIn = new DataInputStream(fileIn);
        ) {
            // READ THE DATA BACK IN THE EXACT SAME ORDER IT WAS WRITTEN!
            boolean readBoolean = dataIn.readBoolean();
            int readInteger = dataIn.readInt();
            double readDouble = dataIn.readDouble();
            
            // Print the read data
            System.out.println("Data successfully read from " + fileName);
            System.out.println("Read Boolean: " + readBoolean);
            System.out.println("Read Int:     " + readInteger);
            System.out.println("Read Double:  " + readDouble);
            
        } catch (FileNotFoundException e) {
            System.err.println("Error: The file '" + fileName + "' was not found.");
        } catch (IOException e) {
            // Handle any file or stream errors
            System.err.println("Error reading data: " + e.getMessage());
        }
    }
}