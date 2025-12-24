package javasocketLab;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	
		// TODO Auto-generated method stub

		public static void main(String[] args) 
			throws IOException {
		
	        ServerSocket ss = new ServerSocket(5000);
	        System.out.println("Server is ready on port 5000.....");
	        Socket cs = ss.accept();
	        System.out.println("Client connected from: " + cs.getInetAddress());
	        
	        DataInputStream dis = new DataInputStream(cs.getInputStream());
	        System.out.println("Client says: " + dis.readUTF());
	        
	        DataOutputStream dos = new DataOutputStream(cs.getOutputStream());
	        dos.writeUTF("Hello from Server!");
	        
	        // Close resources
	        dos.close();
	        dis.close();
	        cs.close();
	        ss.close();
		
		
	}

}
