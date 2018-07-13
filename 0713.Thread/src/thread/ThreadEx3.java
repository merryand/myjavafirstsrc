package thread;

//Runnable 인터페이스를 구현한 클래스
public class ThreadEx3 implements Runnable {
	@Override
	public void run() {
		String msg = "좋은하루";
		//1초마다 무한반복
		int idx = 0;
		while(true) {
			String str = "";
			for(int i =0; i<msg.length(); i = i+1) {
				char ch = msg.charAt((idx+i)%msg.length());
				str = str + ch;
			}
			System.out.println(str);
			try {
				Thread.sleep(1000);
				idx = idx + 1;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
