package javaThread;

public class classB extends Thread {

		public void run () {
			for (int i=1; i<=100;i++) {
				System.out.println("this is class B output"+ i);
			}
		}

	}


}
