package multilocks_using_synchronized_codeblocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {
	
	private static Random r = new Random();
	private static List<Integer> list1 = new ArrayList<>();
	private static List<Integer> list2 = new ArrayList<>();
	
	public static void stageOne() throws InterruptedException {
		Thread.sleep(1);
		list1.add(r.nextInt(100));
	}
	
	public static void stageTwo() throws InterruptedException {
		Thread.sleep(1);
		list2.add(r.nextInt(100));
	}
	
	public static void process() {
		for(int i = 0; i < 10000; i++) {
			try {
				stageOne();
				stageTwo();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Starting");
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				process();
			}
			
		});
	}
}
