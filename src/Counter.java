
public class Counter implements Runnable {

	private int count = 0;
	private int syncCount = 0;

	
	public void increment() {

		count++;
	}

	public synchronized void syncIncrement() {

		syncCount++;
	}

	@Override
	public void run() {

		for (int i = 0; i < 100000; i++) {

			increment();
			syncIncrement();

		}
	}

	public int getCount() {

		return count;

	}

	public synchronized int getSyncCount() {

		return syncCount;

	}

}
