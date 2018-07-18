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
	//생성자
	public EventHandling1() {
		//위치와 크기 설정
		setBounds(800,800,380,200);
		//제목 설정
		setTitle("이벤트 처리 연습");
				
		//여러 개를 배치하기 위해서 패널 배치
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
		
		Button btncalcu = new Button("계산");
		panel.add(btncalcu);
		
		//ActionListener 인터페이스의 anonymous class 생성
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//첫번째와 두번째 텍스트 필드의 내용 가져오기
				String n1 = alpha.getText();
				String n2 = beta.getText();
				//문자열을 정수로 변환해서 더하기
				int resultInt = Integer.parseInt(n1) + Integer.parseInt(n2);
				result.setText(String.format("%d",  resultInt));
			}
			
		};
		
		btncalcu.addActionListener(listener);
		
		Label lblPw = new Label("비밀번호");
		panel.add(lblPw);
		TextField pw = new TextField(15);
		panel.add(pw);
		Label pwResult = new Label();
		panel.add(pwResult);
		
		//텍스트 필드의 내용이 변경될 때를 처리할 수 있는
		//인터페이스의 인스턴스를 생성
		TextListener txtListener = new TextListener() {

			@Override
			public void textValueChanged(TextEvent e) {
				String password = pw.getText();
				//영문 대소문자와 숫자 그리고 특수문자의 개수 세기
				//개수를 저장할 변수들
				int upper = 0;
				int lower = 0;
				int num = 0;
				int etc = 0;
				//초기화 해줘야 하나보다
				//password의 모든 글자를 순회
				for(int i=0; i<password.length(); i = i+1) {
					//i번째 글자 가져오기
					char ch = password.charAt(i);
					//else if를 쓰면 제대로 안될 줄 알았는데 하나씩 가져오는 거라 딱히 문제없나보다.
					//대문자 인지 확인 : A~Z
					if(ch >= 'A' && ch <= 'Z') {
						upper = upper + 1;
					}
					else if(ch >='a' && ch <= 'z') {
						lower = lower + 1;
					}
					//문자열로 받은거라 숫자도 문자열로 구분함
					else if(ch >= '0' && ch <= '9') {
						num = num + 1;
					}
					else {
						etc = etc + 1;
					}
				}
				//4개 중에 한 개도 0이 없으면
				if(upper*lower*num*etc > 0) {
					pwResult.setBackground(Color.YELLOW);
					pwResult.setText("사용 가능한 비밀번호입니다.");
				}
				else {
					pwResult.setBackground(Color.RED);
					pwResult.setText("대소문자와 숫자, 특수기호를 혼합하시기 바랍니다.");
				}
			}
		};
		
		pw.addTextListener(txtListener);
		
		add(panel);
		//화면 출력
		setVisible(true);
	}

}
