package bytestream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\Users\\503-24\\Documents\\java\\0703.txt");
			char[] buf = new char[10];
			while(true) {
				//buf�� ũ�⸸ŭ �о buf�� �����ϰ� ���� ������ r�� ����
				int r = fr.read(buf);
				if(r <= 0) {
					break;
				}
				//�迭���� 0��°���� r�� ���ڿ��� ��ȯ�ؼ� ���
				System.out.println(new String(buf,0,r));
			}
			//fr.read(buf);
			// for(char ch : buf) {
			// System.out.println(ch);
			// }
			//System.out.println(new String(buf));
		} catch (Exception e) {
			System.out.println("�б� ���� : " + e.getMessage());
		} finally {
			try {
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
