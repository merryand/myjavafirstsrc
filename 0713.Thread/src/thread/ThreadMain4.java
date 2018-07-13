package thread;

public class ThreadMain4 {

	public static void main(String[] args) {
		//Runnable 인터페이스를  implements한 클래스의 인스턴스
		ThreadEx4 obj1 = new ThreadEx4("스레드 1");
		ThreadEx4 obj2 = new ThreadEx4("스레드 2");
		
		//스레드 생성
		Thread th1 = new Thread(obj1);
		Thread th2 = new Thread(obj2);
		
		//스레드의 우선 순위 변경
		//가장 낮은 우선 순위로 설정
		th1.setPriority(Thread.MIN_PRIORITY);
		//가장 높은 우선 순위로 설정
		th2.setPriority(Thread.MAX_PRIORITY);
		
		//스레드 시작
		th1.start();
		th2.start();
		
		try {
			Thread.sleep(3000);
			th1.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
