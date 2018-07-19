package swing;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class MyWindow extends JFrame {
	//원래 이 위치에 출력할 인스턴스를 만드는 거래
	//리스트나 콤보박스로 나와야 할 데이터 내용
	String [] data = {"Encapsulation", "Inheritance","Polymorphism","Information Hiding"};
	public MyWindow() {
		//this. 을 이용하면 이클립스의 코드 센스 기능을 쓸 수 있나보다
		this.setBounds(100,100,400,400);
		this.setTitle("스윙");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//만들때 Generic을 적용
		//리스트나 콤보박스에 넣을 내용은 배열로 만들어야 한다는 거 같다
		JList<String>list = new JList<>(data);
		JComboBox<String>combo = new JComboBox<>(data);
		
		JPanel panel = new JPanel();
		panel.add(list);
		panel.add(combo);
		
		add(panel);
		
		this.setVisible(true);
	}

}
