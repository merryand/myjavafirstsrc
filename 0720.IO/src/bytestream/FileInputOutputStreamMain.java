package bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamMain {

	public static void main(String[] args) {
		// try - catch - finally�� ������ ��
		// ���Ͽ� ����Ʈ ������ ����� �� �ִ� ��Ʈ�� ���� ����
		FileOutputStream fos = null;
		try {
			// ���ܰ� �߻��� ���ɼ��� �ִ� ����
			// ./�� ���� ���丮
			//true�� �� ������ �׳� �ϳ��� ��� �ִµ�, ������ �����Ͱ� ����
			fos = new FileOutputStream("./memo.txt", true);
			//���Ͽ� 1����Ʈ ��� 98 �� �ƽ�Ű�ڵ�� b
			//fos.write(98);
			
			//���Ͽ� ����Ʈ �迭�� ���
			byte [] ar = {97,98,99,100,101};
			fos.write(ar);
			
			//���ڿ��� ����Ʈ �迭�� ��ȯ�ؼ� ���
			//getBytes �̿� - �߿�
			String str = "�ȳ��ϼ���";
			fos.write(str.getBytes());
			
			//������ ������ ����
			fos.flush();
		} catch (Exception e) {
			// ���ܰ� �߻����� �� ������ ����
			System.out.println("���� ����� ����!" + e.getMessage());
			//���� ��¥�� �ð� �׸��� ���� ������ �α��մϴ�.
			//���Ͽ� ����ϰų� ��Ʈ��ũ�� ���ؼ� ������ �����մϴ�.
		} finally {
			// ���� �߻� ���ο� �������� ������ ����
			try {
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("./memo.txt");
			//1byte �о����
			//int r = fis.read();
			//System.out.println(r);
			
			//4����Ʈ �б�
//			byte [] b = new byte[4];
//			fis.read(b);
//			System.out.println(b);
			
			//4����Ʈ�� ��ü�� �б�
			//read�� ����Ʈ �迭�� �����ϸ� ���� ������ ����
			//0���� �۰ų� ���� ���� �����ϸ� ���� �����Ͱ� ���� ���Դϴ�.
			while(true) {
				byte [] bi = new byte[10];
				int r = fis.read(bi);
				//�迭�� toString�� ������ �Ǿ� ���� �ʾƼ� �ؽ��ڵ尡 ���
				//System.out.println(bi);
				
				//�ڵ带 ���� ���
				//for (byte imsi : bi) {System.out.println(imsi);}
				System.out.println(new String(bi));
				if(r <= 0) {
					break;
				}
			}
			
		}catch(Exception e) {
			System.out.println("���� �б� ���� :" + e.getMessage());
		}finally {
			try {
				if(fis != null)
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
