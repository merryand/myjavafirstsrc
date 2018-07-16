package frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Panel;

public class MyWindow extends Frame {

	//생성자
	public MyWindow() {
		Dialog dialog = new Dialog(this, "대화상자");
		dialog.setSize(200,200);
		
		setBackground(Color.lightGray);
		setSize(800,800);
		setLocation(100,100);
		setTitle("나의 첫번째 윈도우 프로그램");
		setVisible(true);
		
		Panel panel = new Panel();
		
		Button btn1 = new Button("버튼1");
		//글자가 깨져서 나오는데 MS949가 아니라서 그럼
//		button.setLabel("버튼의 텍스트 변경");
//		button.setBackground(Color.GREEN);
//		button.setForeground(Color.PINK);
//		button.setSize(200,200);
		//add(button); 이렇게 넣으면 버튼이 최대 크기로 들어가버림
		
		//버튼의 배경색을 변경하는 스레드
		//ColorThread th1 = new ColorThread(btn1);
		//익명 클래스
		Thread th1 = new Thread() {
			public void run() {
				Color [] colors = {Color.red, Color.blue, Color.green
			};
				int idx = 0 ;
				while (true) {
					try {
						Thread.sleep(1000);
						idx = idx +1;
						btn1.setBackground(colors[idx % colors.length]);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		th1.start();
		panel.add(btn1);
		
		Button btn2 = new Button("버튼2");
		//TextThread th2 = new TextThread(btn2);
		Thread th2 = new Thread() {
			public void run() {
				String [] text = {"빨강","파랑","초록"};
				int idx = 0;
				while(true) {
					try {
						Thread.sleep(1000);
						idx = idx + 1;
						btn2.setLabel(text[idx % text.length]);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		th2.start();
		
		//버튼의 텍스트를 변경하는 스레드
		panel.add(btn2);
		
		//패널을 프레임에 추가
		add(panel);

	}

}
