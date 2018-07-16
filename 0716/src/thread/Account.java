package thread;

public class Account {
	private int balance;
	
	//잔액을 추가하는 메소드
	public synchronized void save() {
		System.out.println("입금 전 잔액 : " + balance);
		balance = balance + 1000;
		//wait()중인 메소드 깨우기
		notify();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("입금 후 잔액 : " + balance);
	}
	//잔액을 감소시키는 메소드
	public synchronized void depo() {
		if(balance<1000) {
			try {
				//notify()를 호출할 때까지 대기
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("출금 전 잔액 : " + balance);
		balance = balance - 1000;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("출금 후 잔액 : " + balance);
	}

}
