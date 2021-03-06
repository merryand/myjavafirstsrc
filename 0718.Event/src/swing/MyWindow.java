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

//윈도우 클래스
public class MyWindow extends JFrame {
	public MyWindow() {
		//위치와 크기 설정
		setBounds(800,800,800,800);
		//제목 설정
		setTitle("스윙을 이용한 윈도우");
		//종료 버튼 이벤트 처리
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//패널을 생성
		JPanel panel = new JPanel();
		ImageIcon imageIcon = new ImageIcon("C:\\Users\\503-24\\Pictures\\tang.jpg");
		
		JLabel label = new JLabel(imageIcon);
		label.setToolTipText("안녕하세요");
		//TitledBorder border = new TitledBorder("경계선");
		EtchedBorder border = new EtchedBorder(Color.PINK,Color.BLACK);
		label.setBorder(border);
		panel.add(label);
		
		JButton btn = new JButton("버튼");
		panel.add(btn);
		
		//패널을 프레임에 부착
		add(panel);
		
		//화면 출력
		setVisible(true);
		
		//그림 파일 이름을 배열로 만들기
		//배열은 만들면 크기 변경이 안됩니다.
		String [] images = {"tangLeft.jpg","tang.jpg","tangRight.jpg"};
		
		//리스트는 크기 변경이 가능한 배열입니다.
		ArrayList<String> list = new ArrayList<>();
		list.add("tang.jpg");
		list.add("tangLeft.jpg");
		list.add("tangRight.jpg");
		
		//이미지가 변경되는 동안에도 다른 작업을 할 수 있어야 하므로 이미지 변경은 스레드로 생성
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
