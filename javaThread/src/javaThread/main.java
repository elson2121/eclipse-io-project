package javaThread;

public class Main { // Class name corrected to Main (capital 'M')

	public static void main(String[] args) {
		
		
		ClassA classa = new ClassA();
		ClassB classb = new ClassB();
		
	
		classa.start(); 
		classb.start(); 
	}
}