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
	// ������
	public LoginWindow() {
		// ũ��� ��ġ �� Ÿ��Ʋ ����
		setSize(500, 500);
		setLocation(1500, 800);
		setTitle("�α���");

		// �г��� ����
		Panel panel = new Panel();
		Label label = new Label("���̵�");
		TextField txtId = new TextField(20);
		panel.add(label);
		panel.add(txtId);

		Label lblpw = new Label("��й�ȣ");
		TextField txtpw = new TextField(20);
		txtpw.setEchoChar('*');
		panel.add(lblpw);
		panel.add(txtpw);

		TextArea txtaa = new TextArea(10, 50);
		panel.add(txtaa);

		// �г��� �����ӿ� ����
		add(panel);

		// �޴� �� �����
		MenuBar menuBar = new MenuBar();

		// �޴� ����
		Menu file = new Menu("����(F)");

		// �޴��� �޴��ٿ� ����
		menuBar.add(file);
		
		MenuItem newFile = new MenuItem("���� �����");
		file.add(newFile);
		MenuItem save= new MenuItem("����");
		file.add(save);
		
		Menu edit = new Menu("����");
		MenuItem copy= new MenuItem("����");
		menuBar.add(edit);
		//file.add(edit);
		edit.add(copy);
		
		// �޴� �ٸ� �����쿡 ��ġ
		setMenuBar(menuBar);

		// ȭ�� ���
		setVisible(true);
	}

}
