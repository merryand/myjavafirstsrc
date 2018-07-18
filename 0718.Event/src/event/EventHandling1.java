package event;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class EventHandling1 extends Frame {
	//������
	public EventHandling1() {
		//��ġ�� ũ�� ����
		setBounds(800,800,380,200);
		//���� ����
		setTitle("�̺�Ʈ ó�� ����");
				
		//���� ���� ��ġ�ϱ� ���ؼ� �г� ��ġ
		Panel panel = new Panel();
		
		TextField alpha = new TextField(5);
		panel.add(alpha);
		Label plus = new Label("+");
		panel.add(plus);
		TextField beta = new TextField(5);
		panel.add(beta);
		Label equal = new Label("=");
		panel.add(equal);
		TextField result = new TextField(6);
		panel.add(result);
		
		Button btncalcu = new Button("���");
		panel.add(btncalcu);
		
		//ActionListener �������̽��� anonymous class ����
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//ù��°�� �ι�° �ؽ�Ʈ �ʵ��� ���� ��������
				String n1 = alpha.getText();
				String n2 = beta.getText();
				//���ڿ��� ������ ��ȯ�ؼ� ���ϱ�
				int resultInt = Integer.parseInt(n1) + Integer.parseInt(n2);
				result.setText(String.format("%d",  resultInt));
			}
			
		};
		
		btncalcu.addActionListener(listener);
		
		Label lblPw = new Label("��й�ȣ");
		panel.add(lblPw);
		TextField pw = new TextField(15);
		panel.add(pw);
		Label pwResult = new Label();
		panel.add(pwResult);
		
		//�ؽ�Ʈ �ʵ��� ������ ����� ���� ó���� �� �ִ�
		//�������̽��� �ν��Ͻ��� ����
		TextListener txtListener = new TextListener() {

			@Override
			public void textValueChanged(TextEvent e) {
				String password = pw.getText();
				//���� ��ҹ��ڿ� ���� �׸��� Ư�������� ���� ����
				//������ ������ ������
				int upper = 0;
				int lower = 0;
				int num = 0;
				int etc = 0;
				//�ʱ�ȭ ����� �ϳ�����
				//password�� ��� ���ڸ� ��ȸ
				for(int i=0; i<password.length(); i = i+1) {
					//i��° ���� ��������
					char ch = password.charAt(i);
					//else if�� ���� ����� �ȵ� �� �˾Ҵµ� �ϳ��� �������� �Ŷ� ���� ������������.
					//�빮�� ���� Ȯ�� : A~Z
					if(ch >= 'A' && ch <= 'Z') {
						upper = upper + 1;
					}
					else if(ch >='a' && ch <= 'z') {
						lower = lower + 1;
					}
					//���ڿ��� �����Ŷ� ���ڵ� ���ڿ��� ������
					else if(ch >= '0' && ch <= '9') {
						num = num + 1;
					}
					else {
						etc = etc + 1;
					}
				}
				//4�� �߿� �� ���� 0�� ������
				if(upper*lower*num*etc > 0) {
					pwResult.setBackground(Color.YELLOW);
					pwResult.setText("��� ������ ��й�ȣ�Դϴ�.");
				}
				else {
					pwResult.setBackground(Color.RED);
					pwResult.setText("��ҹ��ڿ� ����, Ư����ȣ�� ȥ���Ͻñ� �ٶ��ϴ�.");
				}
			}
		};
		
		pw.addTextListener(txtListener);
		
		add(panel);
		//ȭ�� ���
		setVisible(true);
	}

}
