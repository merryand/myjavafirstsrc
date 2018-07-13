package mutex;

public class Producer extends Thread {
	private ShareData shareData;

	// 생성자
	public Producer(ShareData shareData) {
		this.shareData = shareData;
	}
	//생성할 때 다른 리스트를 가져와서 자기 리스트로 받겠다는 거 같다.
	
	//스레드로 동작할 메소드
	public void run() {
		for(int i=0 ; i<26; i =i+1) {
			//65에 i를 더해서 문자로 변경한 후 save 메소드에게 전달
			shareData.save((char) (65+i));
		}
	}

}
