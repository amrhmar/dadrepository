package exercise1.simple.multithreading.application;

public class exercise1 {

	public static void main(String args[]) {
		multithreadThing threadThing = new multithreadThing();
		try {
			while (threadThing.isAlive()) {
				Thread.sleep(1500);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		System.out.println("Main thread's run is over");
	}
}