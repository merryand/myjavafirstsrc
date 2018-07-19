package swing;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class MyWindow extends JFrame {
	//���� �� ��ġ�� ����� �ν��Ͻ��� ����� �ŷ�
	//����Ʈ�� �޺��ڽ��� ���;� �� ������ ����
	String [] data = {"Encapsulation", "Inheritance","Polymorphism","Information Hiding"};
	public MyWindow() {
		//this. �� �̿��ϸ� ��Ŭ������ �ڵ� ���� ����� �� �� �ֳ�����
		this.setBounds(100,100,400,400);
		this.setTitle("����");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//���鶧 Generic�� ����
		//����Ʈ�� �޺��ڽ��� ���� ������ �迭�� ������ �Ѵٴ� �� ����
		JList<String>list = new JList<>(data);
		JComboBox<String>combo = new JComboBox<>(data);
		
		JPanel panel = new JPanel();
		panel.add(list);
		panel.add(combo);
		
		add(panel);
		
		this.setVisible(true);
	}

}
