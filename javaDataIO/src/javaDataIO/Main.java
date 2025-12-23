package javaDataIO;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io. FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		

				DataOutputStream dos = new DataOutputStream(new FileOutputStream("outputlap.bin"));
				dos.writeInt(10);
				dos.writeDouble(100.5);
				dos.writeBoolean(false);
				dos.writeUTF("Hello world");
				System.out.println("your file saved carfully");
				dos.close();
				
				DataInputStream dis = new DataInputStream(new FileInputStream("outputlap.bin"));
				int valueOfX = dis.readInt();
				System.out.println(valueOfX);
				
				double valueOfY = dis.readDouble();
				System.out.println("Double value: " + valueOfY);
				
				boolean flag = dis.readBoolean();
				System.out.println("Boolean value: " + flag);
				
				dis.close();
				
				
				
				
				
		

	}

}
