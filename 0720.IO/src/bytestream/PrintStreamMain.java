package bytestream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamMain {

	public static void main(String[] args) {
		PrintStream ps = null;
		try {
			ps = new PrintStream(new FileOutputStream("./mono.txt",true));
			ps.println("�ݰ����ϴ�.");
			ps.println("�ٷιٷ� ó�� �մϴ�.");
			ps.flush();
		} catch (Exception e) {
			System.out.println("���� ���� ���� : " + e.getMessage());
		} finally {
			if (ps != null)
				ps.close();
		}

	}

}
