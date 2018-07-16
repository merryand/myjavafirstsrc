package thread;

public class ThreadEx2 extends Thread {
	private Bank bank;
	private String name;
	
	//생성자에서 Bank와 문자열 1개를 대입받기
	public ThreadEx2(Bank bank, String name) {
		this.bank = bank;
		this.name = name;
	}
	//스레드로 동작할 메소드
	public void run() {
		//bank의 메소드를 3번 호출
		for(int i = 0; i<3; i=i+1) {
			bank.job(name);
		}
		
	}

}
