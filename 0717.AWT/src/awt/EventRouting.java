package awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventRouting extends Frame {
	public EventRouting() {
		// �������� ���� ��ǥ�� ũ�⸦ ����
		setBounds(200, 200, 400, 400);
		// �������� ������ ����
		setTitle("�̺�Ʈ �����");
		// ��ư�� ����
		Button btn1 = new Button("�ѱ���");
		Button btn2 = new Button("����");
		Button btn3 = new Button("����");

		Label label = new Label();

		// ���� ���� ������Ʈ���� ���� �� �г� ����
		Panel centerpanel = new Panel();
		// �гο� ��ư�� �߰�
		centerpanel.add(btn1);
		centerpanel.add(btn2);
		centerpanel.add(btn3);
		// �г��� ������ �߽ɿ� �߰�
		add("Center", centerpanel);
		// ���� �ϴܿ� �߰�
		add("South", label);
		
		/*
		ActionListener listener1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("�ȳ��ϼ���");
			}
		};
		//������Ʈ�� �̺�Ʈ�� ó���� �� �ִ� �����ʸ� ����
		btn1.addActionListener(listener1);
		
		ActionListener listener2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("Hello");
			}
		};
		//������Ʈ�� �̺�Ʈ�� ó���� �� �ִ� �����ʸ� ����
		btn2.addActionListener(listener2);
		
		ActionListener listener3 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		};
		//������Ʈ�� �̺�Ʈ�� ó���� �� �ִ� �����ʸ� ����
		btn3.addActionListener(listener3);
		*/
		//���� ��� ��� �����, ��ư�� ���� �� ���� �ϳ��� ����� ��� ��
		
		//�̺�Ʈ ����� - �ϳ��� �����ʰ� ���� ������Ʈ�� �̺�Ʈ�� ó���ϴ� ��
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				switch(e.getActionCommand()) {
				//���� �б� ���� ���� ���� switch�� �˾ƺ��� ����.
				//if���̶�� equals�� ��� �Ѵ�.
				case "�ѱ���" : label.setText("�ȳ��ϼ���");
				break;
				case "����" : label.setText("Hello");
				break;
				case "����" : System.exit(0);
				break;
			}
			}
		};
		//3���� ��ư�� �׼� �̺�Ʈ�� listener�� ��� ó��
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		btn3.addActionListener(listener);
		//�ν��Ͻ� ������ ���� �ϴ�, �޸� �Ҵ緮�� ���δ�.
		//������ ������ ���� �� ��������� ó�� �� �� �־�� �Ѵ�.

		// �����츦 ȭ�鿡 ���
		setVisible(true);
	}

}
