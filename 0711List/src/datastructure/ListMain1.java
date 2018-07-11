package datastructure;

//import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain1 {

	public static void main(String[] args) {
		//문자열을 저장할 수 있는 ArrayList
		//ArrayList<String> arrayList = new ArrayList<>();
		LinkedList<String> arrayList = new LinkedList<>();
		//데이터를 삽입
		arrayList.add("고양이");
		arrayList.add("개");
		arrayList.add("햄스터");
		arrayList.add("앵무새");
		arrayList.add("도마뱀");
		
		//데이터 개수
		System.out.println("데이터 개수 : "+arrayList.size());
		//전체 데이터 출력
		for(String temp : arrayList) {
			System.out.println(temp);
		}
		//2번째 데이터 출력하기
		System.out.println("=============================");
		System.out.println(arrayList.get(2-1));
	}

}
