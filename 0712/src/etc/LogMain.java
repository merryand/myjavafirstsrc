package etc;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;

public class LogMain {

	public static void main(String[] args) {
		//읽어낼 파일 인스턴스 만들기
		File f =new File("C:\\Users\\503-24\\Documents\\java\\log.txt");
		HashSet<String> set = new HashSet<String>();
		int sum = 0;
		try {
			// 파일의 내용을 읽을 수 있는 Scanner 인스턴스 만들기
		Scanner sc = new Scanner(f);
		//읽은 다음 줄이 있을 때 까지 수행
		while(sc.hasNextLine()) {
			//System.out.println(sc.nextLine());
			//한 줄 읽기
			String temp = sc.nextLine();
			//공백으로 분할하기
			String [] ar = temp.split(" ");
			set.add(ar[0]);
			//배열을 정수로 바꿔서 더하면, 배열 안에 있는 모든 정수를 더하는 게 되나보다.
			sum = sum + Integer.parseInt(ar[ar.length-1]);
		}
		System.out.println(set);
		System.out.println("트래픽 합계 : " + sum);
		sc.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
