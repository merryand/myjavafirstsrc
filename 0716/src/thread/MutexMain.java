package thread;

public class MutexMain {

	public static void main(String[] args) {
		Bank bank =new Bank();
		//스레드 인스턴스 만들기
		ThreadEx2 atm = new ThreadEx2(bank,"ATM");
		atm.start();
		//스레드 인스턴스 만들기
		ThreadEx2 internet = new ThreadEx2(bank,"Internet");
		internet.start();


	}

}
