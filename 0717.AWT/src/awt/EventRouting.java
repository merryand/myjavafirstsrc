package awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventRouting extends Frame {
	public EventRouting() {
		// 윈도우의 시작 좌표와 크기를 설정
		setBounds(200, 200, 400, 400);
		// 윈도우의 제목을 설정
		setTitle("이벤트 라우팅");
		// 버튼을 생성
		Button btn1 = new Button("한국어");
		Button btn2 = new Button("영어");
		Button btn3 = new Button("종료");

		Label label = new Label();

		// 여러 개의 컴포넌트들을 묶어 줄 패널 생성
		Panel centerpanel = new Panel();
		// 패널에 버튼을 추가
		centerpanel.add(btn1);
		centerpanel.add(btn2);
		centerpanel.add(btn3);
		// 패널을 윈도우 중심에 추가
		add("Center", centerpanel);
		// 라벨을 하단에 추가
		add("South", label);
		
		/*
		ActionListener listener1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("안녕하세요");
			}
		};
		//컴포넌트와 이벤트를 처리할 수 있는 리스너를 연결
		btn1.addActionListener(listener1);
		
		ActionListener listener2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("Hello");
			}
		};
		//컴포넌트와 이벤트를 처리할 수 있는 리스너를 연결
		btn2.addActionListener(listener2);
		
		ActionListener listener3 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		};
		//컴포넌트와 이벤트를 처리할 수 있는 리스너를 연결
		btn3.addActionListener(listener3);
		*/
		//위의 방식 대로 만들면, 버튼을 만들 때 마다 하나씩 만들어 줘야 함
		
		//이벤트 라우팅 - 하나의 리스너가 여러 컴포넌트의 이벤트를 처리하는 것
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				switch(e.getActionCommand()) {
				//적은 분기 수를 가질 때는 switch가 알아보기 쉽다.
				//if문이라면 equals로 써야 한다.
				case "한국어" : label.setText("안녕하세요");
				break;
				case "영어" : label.setText("Hello");
				break;
				case "종료" : System.exit(0);
				break;
			}
			}
		};
		//3개의 버튼의 액션 이벤트를 listener가 모두 처리
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		btn3.addActionListener(listener);
		//인스턴스 생성을 적게 하니, 메모리 할당량을 줄인다.
		//일정한 패턴을 가진 건 라우팅으로 처리 할 수 있어야 한다.

		// 윈도우를 화면에 출력
		setVisible(true);
	}

}
