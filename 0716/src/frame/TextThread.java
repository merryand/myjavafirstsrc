package frame;

import java.awt.Button;

public class TextThread extends Thread {
	private Button button;
	
	public TextThread(Button button) {
		this.button = button;
	}
	
	public void run() {
		
		String [] text = {
				"Java", "Oracle", "Android","ios"
		};
		int idx = 0;
		while(true) {
			try {
				//colors 배열 안의 값만 선택하기
				idx = idx+1;
				button.setLabel(text[idx % text.length]);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
