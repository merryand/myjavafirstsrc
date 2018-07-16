package thread;

public class ThreadEx3 extends Thread {
	private Account account;
	
	public ThreadEx3(Account account) {
		this.account = account;
	}
	
	public void run() {
		for(int i =0; i <5; i =i+1) {
			account.save();
		}
	}

}
