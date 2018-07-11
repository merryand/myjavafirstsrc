package datastructure;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class ListMain3 {

	public static void main(String[] args) {
		// 정수 List와 문자열 List의 정렬
		ArrayList<Integer>list1 = new ArrayList<>();
		list1.add(40);
		list1.add(30);
		list1.add(35);
		
		Comparator<Integer> comp = new Comparator() {
			//정수 비교라서 뺄셈으로 가능
			@Override
			public int compare(Object o1, Object o2) {
				Integer first = (Integer)o1;
				Integer second = (Integer)o2;
				return first-second;
			}
		};
		
		list1.sort(comp);
		//List는 toString이 재정의 되어 있어서 인스턴스를 출력하면
		//데이터가 순서대로 toString을 호출합니다.
		System.out.println(list1);
		
		LinkedList<String>list2 = new LinkedList<>();
		list2.add("데니스 리치히");
		list2.add("제임스 고슬링");
		list2.add("리누스 토발즈");
		
		Comparator<String>comp1 = new Comparator() {
			//문자열 비교
			@Override
			public int compare(Object o1, Object o2) {
				String one = (String)o1;
				String two = (String)o2;
				return one.compareTo(two);
			}
			
		};
		//언제나 정렬을 하기 위해 비교하는 메소드의 두 인자 위치를 뒤바꾸면 내림차순
		list2.sort(comp1);
		System.out.println(list2);

	}

}
