package awt;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;

public class CommonsDialog extends Frame {
	public CommonsDialog() {
		setBounds(200,200, 600,600);
		setTitle("���� ��ȭ ����");
		
		//���� ��ȭ���� �����
		FileDialog fileDialog = new FileDialog(this, "���� ��ȭ����");
		
		//���丮 ����
		fileDialog.getDirectory();
		
		//���� ��ȭ���ڸ� ȭ�鿡 ���
		fileDialog.setVisible(true);
		
		//������ ���� ��� ��������
		String filePath = fileDialog.getDirectory() + fileDialog.getFile();
		
		Label label = new Label(filePath);
		add(label);
		
		setVisible(true);
	}

}
