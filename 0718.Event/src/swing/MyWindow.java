package swing;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
//import javax.swing.border.TitledBorder;

//������ Ŭ����
public class MyWindow extends JFrame {
	public MyWindow() {
		//��ġ�� ũ�� ����
		setBounds(800,800,800,800);
		//���� ����
		setTitle("������ �̿��� ������");
		//���� ��ư �̺�Ʈ ó��
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//�г��� ����
		JPanel panel = new JPanel();
		ImageIcon imageIcon = new ImageIcon("C:\\Users\\503-24\\Pictures\\tang.jpg");
		
		JLabel label = new JLabel(imageIcon);
		label.setToolTipText("�ȳ��ϼ���");
		//TitledBorder border = new TitledBorder("��輱");
		EtchedBorder border = new EtchedBorder(Color.PINK,Color.BLACK);
		label.setBorder(border);
		panel.add(label);
		
		JButton btn = new JButton("��ư");
		panel.add(btn);
		
		//�г��� �����ӿ� ����
		add(panel);
		
		//ȭ�� ���
		setVisible(true);
		
		//�׸� ���� �̸��� �迭�� �����
		//�迭�� ����� ũ�� ������ �ȵ˴ϴ�.
		String [] images = {"tangLeft.jpg","tang.jpg","tangRight.jpg"};
		
		//����Ʈ�� ũ�� ������ ������ �迭�Դϴ�.
		ArrayList<String> list = new ArrayList<>();
		list.add("tang.jpg");
		list.add("tangLeft.jpg");
		list.add("tangRight.jpg");
		
		//�̹����� ����Ǵ� ���ȿ��� �ٸ� �۾��� �� �� �־�� �ϹǷ� �̹��� ������ ������� ����
		Thread th = new Thread() {
			public void run() {
				int index = 0;
				while(true) {
					try {
						Thread.sleep(50);
						//ImageIcon icon = new ImageIcon("C:\\Users\\503-24\\Pictures\\" + images[index%images.length]);
						ImageIcon icon = new ImageIcon("C:\\Users\\503-24\\Pictures\\" + list.get(index%list.size()));
						label.setIcon(icon);
						index = index+1;
					}
					catch(InterruptedException e){
						e.printStackTrace();
					}
				}
			}
		};
		th.start();
	}

}
