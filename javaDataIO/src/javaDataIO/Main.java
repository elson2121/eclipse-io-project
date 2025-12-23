package javaDataIO;
import java.io. FileInputStream;
import java.io.FileOutputStream;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataOutputStream dos= new DatOutPutStream(new FileOutPutStream("output"))
				dos.writeInt(10);
				dos.writeDouble(100.5);
				dos.writeBoolean(false);
				dos.writeUTF("Hello world");
				System .out.println("your file saved carfully");
				dos.close();
				DataInputStream dis=new DataInputStream(new FileInputStream("outputlap.bin"))
				int valueOfX =dis.readInt();
				System.out.println(valueOfX);
				dis.close();
		
		

	}

}
