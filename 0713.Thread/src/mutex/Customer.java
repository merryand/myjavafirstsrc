package mutex;

//List에서 
public class Customer extends Thread {
	private ShareData shareData;

	// 생성자
	public Customer(ShareData shareData) {
		this.shareData = shareData;
	}
	public void run() {
		for(int i=0 ; i<26; i =i+1) {
			//65에 i를 더해서 문자로 변경한 후 save 메소드에게 전달
			shareData.get();
		}
	}

}
