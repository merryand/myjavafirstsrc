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
		setTitle("Ű���� �̺�Ʈ");
		setLayout(null);
		Label air = new Label("@");
		air.setBounds(10, 40, 50, 50);
		add(air);

		KeyListener keyListener = new KeyListener() {
			// ���� Ű�� ������ ��
			@Override
			public void keyTyped(KeyEvent e) {
			}
			// Ű���带 ������ �� ȣ��Ǵ� �޼ҵ�
			@Override
			public void keyPressed(KeyEvent e) {
				// ������� �ڹ� 10�� ��Ŭ���� ������ �޶� KeyEvent e�� �ƴ϶� args0���� ��������
				// �̰� �ڹ� 1.8
				int x = air.getLocation().x;
				int y = air.getLocation().y;
				// �̰� �� �̷��� �� �򰥸��µ� �ƴ� �˰ڴ� 2���� 4���� ��ǥ�� �����ؾ߰ڴ�
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
				// Modifiers�� ���� ���� ����Ű ���� ����
				// ��Ű���� ��ƮŰ�� �ɼ�Ű
				if (e.getModifiers() == KeyEvent.ALT_MASK && e.getKeyCode() == KeyEvent.VK_F4)
					System.exit(0);

				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					Label bullet = new Label("�Ѿ�");
					bullet.setBounds(air.getLocation().x, air.getLocation().y - 10, 30, 30);
					add(bullet);
					// ������ ����
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
					// ����
					th.start();
				}
			}

			// Ű���忡�� ���� ���� ��
			@Override
			public void keyReleased(KeyEvent e) {
			}
		};
		//Frame�� Ű���� �̺�Ʈ ����
		addKeyListener(keyListener);
		
		//������ ������ ���� �̺�Ʈ�� ó���ϱ� ���� ������
//		WindowListener windowListener = new WindowListener() {
		//��� ���� ���ϴ� �޼ҵ常 �� �� �ְ� ���ֳ�
		//�׷��� �ʺ��ڴ� ��õ�� �� �ѵ�
		WindowAdapter windowListener = new WindowAdapter() {

//			@Override
//			public void windowOpened(WindowEvent e) {
//				
//			}
			//���� ��ư�� ���� �� ȣ��Ǵ� �޼ҵ�
			@Override
			public void windowClosing(WindowEvent e) {
				//���α׷� ����
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
		//������ ������ �̺�Ʈ ����
		addWindowListener(windowListener);
		setVisible(true);
	}

}
