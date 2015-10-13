public class SyncTest {

	public static void main(String[] args) {

	
		Counter counter = new Counter();
		Thread t1 = new Thread(counter);
		Thread t2 = new Thread(counter);
		t1.start();
		t2.start();
		
		try {t1.join();
			t2.join();
		
		}catch(Exception e){
			System.out.println("Interupted");
		}

		System.out.println("The count is : " + counter.getCount());
		System.out.println("The synchronised count is : "
				+ counter.getSyncCount());

	}

}

