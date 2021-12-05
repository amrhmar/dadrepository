package exercise1;

import java.util.Date;

public class multithreadThing extends Thread {
	
	Date date = java.util.Calendar.getInstance().getTime();

	multithreadThing()
	   {
	     System.out.println("My thread created " + date);
	     start();
	   }

	public void run() {
				
		try {
			for (int i = 0; i <= 10; i++) {
				System.out.println(date + " " + i + getClass().getName());
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("my thread interrupted");
		}
		System.out.println("My thread run is over");
	}
}