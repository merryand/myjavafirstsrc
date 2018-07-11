package datastructure;

import java.util.ArrayList;
import java.util.Comparator;

public class ListMain4 {

	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<>();
		Book book = new Book();
		book.setTitle("바람과 함께 사라지다");
		book.setPrice(12000);
		list.add(book);
		
		book = new Book(); //인스턴스 초기화 인가? 어쨌든 재사용
		book.setTitle("닥터 지바고");
		book.setPrice(23000);
		list.add(book);
		
		book = new Book();
		book.setTitle("죄와 벌");
		book.setPrice(35000);
		list.add(book);
		
		Comparator<Book> comp = new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Book first = (Book)o1;
				Book second = (Book)o2;
				return first.getPrice()-second.getPrice();
				//저장하려고 만든 클래스여서 비교할 요소를 가져와야 함
				//가격 오름차순
			}
			
		};
		
		//정렬
		list.sort(comp);
		//리스트의 모든 데이터 확인
		System.out.println(list);
		//각각의 데이터 확인
		for(Book temp : list) {
			System.out.println(temp);
		}		
	}

}
