package how_to_start_threads1;

public class Runner extends Thread {
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Hello" + i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
