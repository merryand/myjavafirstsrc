package File;

import java.io.File;
//import java.util.Date;
import java.sql.Date;

public class FileMain {

	public static void main(String[] args) {
		//���Ͽ� ���� ������ Ȯ���� �� �ִ� Ŭ������ �ν��Ͻ��� ����
		File f = new File("C:\\Users\\503-24\\Pictures\\12.jpg");
		
		//������ ���� ����
		System.out.println(f.exists());
		//������ ũ��
		long size = f.length();
		//����Ʈ ������ ���ͼ� 1024�� ������ ų�� ����Ʈ
		System.out.println(size/1024 +"KB");
		//������ ���� �����ð�
		Date date = new Date(f.lastModified());
		System.out.println(date);
		
		File file = new File("C:\\Users\\503-24\\Pictures\\ta.mal.jpg");
		String parent = file.getParent();
		String filename = file.getName();
		//filename ���� ta.�� ������ �κ��� ��������
		//.�� ��ġ�� ã�Ƽ� . ������ ���ڿ� ��������
		int idx = filename.indexOf('.');
		//.�� �����Ѵٸ� : ��ġ�� ã�� �޼ҵ�� ã���� �ϴ� �����Ͱ� ������ ������ ����
		if (idx >= 0) {
			//���ڿ��� ��ġ�� ������ �ڸ��� �޼ҵ� : substring
			filename = filename.substring(idx+1);
		}
		System.out.println(filename);
		//�̸� �ٲٱ�
		String newFile = parent +"\\"+filename;
		System.out.println(newFile);
		file.renameTo(new File(parent,filename));
		
	}

}
