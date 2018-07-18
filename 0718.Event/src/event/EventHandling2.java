package event;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventHandling2 extends Frame {

	public EventHandling2() {
		setBounds(1000, 1000, 500, 500);
		setTitle("키보드 이벤트");
		setLayout(null);
		Label air = new Label("@");
		air.setBounds(10, 40, 50, 50);
		add(air);

		KeyListener keyListener = new KeyListener() {
			// 문자 키를 눌렀을 때
			@Override
			public void keyTyped(KeyEvent e) {
			}
			// 키보드를 눌렀을 때 호출되는 메소드
			@Override
			public void keyPressed(KeyEvent e) {
				// 강사님은 자바 10에 이클립스 버전도 달라서 KeyEvent e가 아니라 args0으로 나오더라
				// 이건 자바 1.8
				int x = air.getLocation().x;
				int y = air.getLocation().y;
				// 이거 왜 이러는 지 헷갈리는데 아니 알겠다 2차원 4분할 좌표를 생각해야겠다
				if (e.getKeyCode() == e.VK_UP) {
					y = y - 10;
				}
				if (e.getKeyCode() == e.VK_DOWN) {
					y = y + 10;
				}
				if (e.getKeyCode() == e.VK_LEFT) {
					x = x - 10;
				}
				if (e.getKeyCode() == e.VK_RIGHT) {
					x = x + 10;
				}
				air.setLocation(x, y);
				// Modifiers는 같이 누른 조합키 값을 리턴
				// 맥키보드 알트키가 옵션키
				if (e.getModifiers() == KeyEvent.ALT_MASK && e.getKeyCode() == KeyEvent.VK_F4)
					System.exit(0);

				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					Label bullet = new Label("총알");
					bullet.setBounds(air.getLocation().x, air.getLocation().y - 10, 30, 30);
					add(bullet);
					// 스레드 만들어서
					Thread th = new Thread() {
						public void run() {
							try {
								while (true) {
									Thread.sleep(100);
									int x = bullet.getLocation().x;
									int y = bullet.getLocation().y;
									bullet.setLocation(x, y - 5);
									if (y < 60)
										break;
								}
								bullet.setVisible(false);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					};
					// 실행
					th.start();
				}
			}

			// 키보드에서 손을 땠을 때
			@Override
			public void keyReleased(KeyEvent e) {
			}
		};
		//Frame에 키보드 이벤트 설정
		addKeyListener(keyListener);
		
		//윈도우 조작을 위한 이벤트를 처리하기 위한 리스너
//		WindowListener windowListener = new WindowListener() {
		//어뎁터 만이 원하는 메소드만 할 수 있게 해주네
		//그런데 초보자는 추천을 안 한데
		WindowAdapter windowListener = new WindowAdapter() {

//			@Override
//			public void windowOpened(WindowEvent e) {
//				
//			}
			//종료 버튼을 누를 때 호출되는 메소드
			@Override
			public void windowClosing(WindowEvent e) {
				//프로그램 종료
				System.exit(0);
			}

//			@Override
//			public void windowClosed(WindowEvent e) {
//				
//			}
//
//			@Override
//			public void windowIconified(WindowEvent e) {
//				
//			}
//
//			@Override
//			public void windowDeiconified(WindowEvent e) {
//				
//			}
//
//			@Override
//			public void windowActivated(WindowEvent e) {
//				
//			}
//
//			@Override
//			public void windowDeactivated(WindowEvent e) {
//				
//			}
		};
		//프레임 윈도우 이벤트 연결
		addWindowListener(windowListener);
		setVisible(true);
	}

}
