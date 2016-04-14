package how_to_start_threads_4;

import java.util.Scanner;

class Processor extends Thread {
	
	private volatile boolean flag = true;
	public void run() {
		while (flag) {
			System.out.println("Hello!");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown() {
		flag = false;
	}
}

public class App {

	public static void main(String[] args) {
		Processor p1 = new Processor();
		p1.start();
		Scanner s = new Scanner(System.in);
		System.out.println("Press enter to pause");
		s.nextLine();
		p1.shutdown();
	}

}
