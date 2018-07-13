package mutex;

public class SyncMain {

	public static void main(String[] args) {
		ShareData shareData = new ShareData();
		
		Producer p = new Producer(shareData);
		Customer c = new Customer(shareData);
		
		p.start();
		
		c.start();

	}

}
