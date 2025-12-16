package book;

public class ClassA extends Thread {
	public void run() {
		for (int i = 1; i <= 100; i++) {
		
			System.out.println("This is Class A output: " + i); 
		}
	
	}
}
