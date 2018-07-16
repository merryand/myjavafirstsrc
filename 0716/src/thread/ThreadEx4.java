package thread;

public class ThreadEx4 extends Thread {
private Account account;
	
	public ThreadEx4(Account account) {
		this.account = account;
	}
	
	public void run() {
		for(int i =0; i <5; i =i+1) {
			account.depo();
		}
	}
}
