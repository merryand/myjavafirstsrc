package arrays;

import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {
		//문자열 배열 생성
		String [] subject = {"Java", "Oracle", "Web Front End", "Web Back End - Java", "Android", "ios"};
		//subject 정의
		Arrays.sort(subject);
		//정렬 후 배열 출력
		for (String sortSubject : subject) {
			System.out.println(sortSubject);
		}
		//Oracle의 위치 검색
		int idx = Arrays.binarySearch(subject, "Oracle");
		System.out.println(idx);
		//Android의 위치 검색 - 제대로 안나옴. 정렬이 안되어 있어서 - 정렬한 후엔 0
		idx = Arrays.binarySearch(subject, "Android");
		System.out.println(idx);

}
}