package exercise2;

import java.util.Arrays;

public class multithreadThing2 implements Runnable {

	Thread mythread;
	String[] name = { "It", "is", "recommended", "to", "use", "Calender", "class"};

	multithreadThing2() {
		mythread = new Thread(this, "My runnable thread");
		mythread.start();
	}

	public void run() {
		try {
			for (int i = 0; i <= 10; i++) {
				System.out.println(Arrays.toString(name) + " " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("my thread interrupted");
		}
		System.out.println("mythread run is over");
	}
}
