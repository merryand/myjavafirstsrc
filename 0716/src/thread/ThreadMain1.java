package thread;

public class ThreadMain1 {

	public static void main(String[] args) {
		//클래스이 run 메소드 사용
		ThreadEx1 th1 = new ThreadEx1();
		//데몬 스레드로 설정
		th1.setDaemon(true);
		//스레드 시작
		th1.start();
		
		try {
			Thread.sleep(2000);
			//InterruptedException을 발생시킵니다.
			th1.interrupt();
			Thread.sleep(3000);
			//System.out.println("메인 종료");
			//프로그램 종료
			//System.exit(0);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
