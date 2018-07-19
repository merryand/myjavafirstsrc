package File;

import java.io.File;
//import java.util.Date;
import java.sql.Date;

public class FileMain {

	public static void main(String[] args) {
		//파일에 대한 정보를 확인할 수 있는 클래스의 인스턴스를 생성
		File f = new File("C:\\Users\\503-24\\Pictures\\12.jpg");
		
		//파일의 존재 여부
		System.out.println(f.exists());
		//파일의 크기
		long size = f.length();
		//바이트 단위로 나와서 1024로 나누면 킬로 바이트
		System.out.println(size/1024 +"KB");
		//파일의 최후 수정시간
		Date date = new Date(f.lastModified());
		System.out.println(date);
		
		File file = new File("C:\\Users\\503-24\\Pictures\\ta.mal.jpg");
		String parent = file.getParent();
		String filename = file.getName();
		//filename 에서 ta.을 제거한 부분을 가져오기
		//.의 위치를 찾아서 . 이후의 문자열 가져오기
		int idx = filename.indexOf('.');
		//.이 존재한다면 : 위치를 찾는 메소드는 찾고자 하는 데이터가 없으면 음수를 리턴
		if (idx >= 0) {
			//문자열을 위치를 가지고 자르는 메소드 : substring
			filename = filename.substring(idx+1);
		}
		System.out.println(filename);
		//이름 바꾸기
		String newFile = parent +"\\"+filename;
		System.out.println(newFile);
		file.renameTo(new File(parent,filename));
		
	}

}
