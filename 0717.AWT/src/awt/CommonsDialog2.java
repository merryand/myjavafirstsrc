package awt;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;

public class CommonsDialog2 extends Frame {
	//������ - �ν��Ͻ��� ������ �� ȣ���ϴ� �޼ҵ�
	public CommonsDialog2() {
		//��ġ�� ũ�⸦ ����
		setBounds(1500,900,800,800);
		//���� ����
		setTitle("�����ȭ����");
		
		//FileDialog ��ü�� �����ؼ� ȭ�鿡 ����ϰ�
		//������ ���� ��θ� ���̺� ���
		//FileDialog�� ������ �� ù��° �Ű�������
		//Dialog�� Frame�� �ּ��ε�
		//������ ���� this�� �����ϸ� �˴ϴ�.
		
		//FileDialog �ν��Ͻ� ����
		FileDialog fileDialog = new FileDialog(this,"���� ��ȭ����");
		//ȭ�� ���
		fileDialog.setVisible(true);
		//������ ���丮�� �����̸��� ��������
		String filePath = fileDialog.getDirectory() + fileDialog.getFile();
		
		//���̺� ����
		Label fdDir = new Label(filePath);
		add(fdDir);
		
		//ȭ�� ���
		setVisible(true);
	}

}
