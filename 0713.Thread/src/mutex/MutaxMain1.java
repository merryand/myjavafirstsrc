package mutex;

public class MutaxMain1 {

	public static void main(String[] args) {
		Mutex mutex = new Mutex();
		Thread th1 = new Thread(mutex);
		th1.start();
		Thread th2 = new Thread(mutex);
		th2.start();

		// 25초 후에 result값 확인

		try {
			Thread.sleep(25000);
			System.out.println(mutex.getResult());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
