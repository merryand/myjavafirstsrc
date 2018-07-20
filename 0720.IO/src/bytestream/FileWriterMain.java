package bytestream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("./char.txt");
			fw.write("안녕하십니까");
			fw.write("반가워요. \n");
			fw.write("문자열을 파일에 기록하고 있습니다");
			fw.flush();
		} catch (Exception e) {
			System.out.println("기록 예외 : " + e.getMessage());
		} finally {
			try {
				if (fw != null)
					fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
