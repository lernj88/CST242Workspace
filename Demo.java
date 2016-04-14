package how_to_start_threads1;

public class Demo {
	public static void main(String[] args) {
		Runner r1 = new Runner();
		Runner r2 = new Runner();
		Runner r3 = new Runner();
		Runner r4 = new Runner();
		
		r1.start();
		r2.start();
		r3.start();
		r4.start();
	}

}
