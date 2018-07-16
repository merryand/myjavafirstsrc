package frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Panel;

public class MyWindow extends Frame {

	//������
	public MyWindow() {
		Dialog dialog = new Dialog(this, "��ȭ����");
		dialog.setSize(200,200);
		
		setBackground(Color.lightGray);
		setSize(800,800);
		setLocation(100,100);
		setTitle("���� ù��° ������ ���α׷�");
		setVisible(true);
		
		Panel panel = new Panel();
		
		Button btn1 = new Button("��ư1");
		//���ڰ� ������ �����µ� MS949�� �ƴ϶� �׷�
//		button.setLabel("��ư�� �ؽ�Ʈ ����");
//		button.setBackground(Color.GREEN);
//		button.setForeground(Color.PINK);
//		button.setSize(200,200);
		//add(button); �̷��� ������ ��ư�� �ִ� ũ��� ������
		
		//��ư�� ������ �����ϴ� ������
		//ColorThread th1 = new ColorThread(btn1);
		//�͸� Ŭ����
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
		
		Button btn2 = new Button("��ư2");
		//TextThread th2 = new TextThread(btn2);
		Thread th2 = new Thread() {
			public void run() {
				String [] text = {"����","�Ķ�","�ʷ�"};
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
		
		//��ư�� �ؽ�Ʈ�� �����ϴ� ������
		panel.add(btn2);
		
		//�г��� �����ӿ� �߰�
		add(panel);

	}

}
