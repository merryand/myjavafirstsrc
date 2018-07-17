package awt;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class LoginWindow extends Frame {
	// 생성자
	public LoginWindow() {
		// 크기와 위치 및 타이틀 설정
		setSize(500, 500);
		setLocation(1500, 800);
		setTitle("로그인");

		// 패널을 생성
		Panel panel = new Panel();
		Label label = new Label("아이디");
		TextField txtId = new TextField(20);
		panel.add(label);
		panel.add(txtId);

		Label lblpw = new Label("비밀번호");
		TextField txtpw = new TextField(20);
		txtpw.setEchoChar('*');
		panel.add(lblpw);
		panel.add(txtpw);

		TextArea txtaa = new TextArea(10, 50);
		panel.add(txtaa);

		// 패널을 프레임에 부착
		add(panel);

		// 메뉴 바 만들기
		MenuBar menuBar = new MenuBar();

		// 메뉴 생성
		Menu file = new Menu("파일(F)");

		// 메뉴를 메뉴바에 부착
		menuBar.add(file);
		
		MenuItem newFile = new MenuItem("새로 만들기");
		file.add(newFile);
		MenuItem save= new MenuItem("저장");
		file.add(save);
		
		Menu edit = new Menu("편집");
		MenuItem copy= new MenuItem("복사");
		menuBar.add(edit);
		//file.add(edit);
		edit.add(copy);
		
		// 메뉴 바를 윈도우에 배치
		setMenuBar(menuBar);

		// 화면 출력
		setVisible(true);
	}

}
