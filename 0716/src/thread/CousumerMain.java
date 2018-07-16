package thread;

public class CousumerMain {

	public static void main(String[] args) {
		Account account = new Account();
		ThreadEx3 th1 = new ThreadEx3(account);
		th1.start();
		
		ThreadEx4 th2 = new ThreadEx4(account);
		th2.start();

	}

}
