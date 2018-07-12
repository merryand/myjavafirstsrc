package etc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		//키보드로부터 한 줄을 입력받아서 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("한 줄의 문자열 입력 : ");
		//한 줄을 입력받는 객체
		//String msg = sc.nextLine();
		// 공백 단위로 구분해서 입력받기
		String msg = sc.next();
		//하나 띄고 쓰니까 띄기 전 까지 내용만 받았다.
		System.out.println(msg);
		
		//스캐너를 사용하면 마지막에 닫아주어야 합니다.
		sc.close();
		
		//문자열로 부터 받기
		sc =new Scanner("Hello Java");
		//공백 구분해서 건너건너씩 나온다
		System.out.println(sc.next());
		System.out.println(sc.next());
		sc.close();
		//파일 객체 만들기
		File f = new File("C:\\Users\\503-24\\Documents\\Name\\C\\Work\\Hello.java");
		//파일과 연결되는 스캐너 객체 만들기
		try {
			sc = new Scanner(f);
			//데이터가 있을 때 까지 읽기
			//파일은 있는데 내용을 못 읽는 경우는 2가지 경우
			//구분문자가 없는 경우이고 한글 인코딩이 서로 다른 경우입니다.
			//한글 인코딩이 잘못되면 글자가 깨지는 게 아니고 Scanner는 읽지를 못합니다.
			//공백 문자를 찾아야 하는데 인코딩이 다르면 공백문자의 코드 값이 다릅니다.
			while(sc.hasNext()) {
				System.out.println(sc.next());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

}
