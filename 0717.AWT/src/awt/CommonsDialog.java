package awt;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;

public class CommonsDialog extends Frame {
	public CommonsDialog() {
		setBounds(200,200, 600,600);
		setTitle("공통 대화 상자");
		
		//파일 대화상자 만들기
		FileDialog fileDialog = new FileDialog(this, "파일 대화상자");
		
		//디렉토리 설정
		fileDialog.getDirectory();
		
		//파일 대화상자를 화면에 출력
		fileDialog.setVisible(true);
		
		//선택한 파일 경로 가져오기
		String filePath = fileDialog.getDirectory() + fileDialog.getFile();
		
		Label label = new Label(filePath);
		add(label);
		
		setVisible(true);
	}

}
