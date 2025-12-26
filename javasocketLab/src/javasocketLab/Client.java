package javasocketLab;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
            // REPLACE THIS WITH SERVER'S ACTUAL IP ADDRESS
            String serverIP = "192.168.137.1"; // Change this!
            Socket s = new Socket(serverIP, 5000);
            
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            dos.writeUTF("Hello Server desktop from Client!");
            
            DataInputStream dis = new DataInputStream(s.getInputStream());
            System.out.println("Server response: " + dis.readUTF());
            
            // Close resources
            dis.close();
            dos.close();
            s.close();
            
        } catch (IOException e) {
            System.out.println("Connection failed: " + e.getMessage());
            System.out.println("Make sure:");
            System.out.println("1. Server is running");
            System.out.println("2. Correct IP address");
            System.out.println("3. Firewall allows port 5000");
        }	
		
		
	}

}
