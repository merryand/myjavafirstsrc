package thread;

public class ThreadMain3 {

	public static void main(String[] args) {
		// Runnable 인터페이스를 implements 한 클래스를 이용해서 스레드 시작
		ThreadEx3 obj = new ThreadEx3();
		Thread th = new Thread(obj);
		th.start();
	}

}
