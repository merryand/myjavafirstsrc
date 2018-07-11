package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// 인스턴스 배열 만들기
		Book[] bookbin = new Book[5];
		// 아직은 모두 null
		bookbin[0] = new Book();
		// 값을 채웁니다.
		bookbin[0].setTitle("삼국지");
		bookbin[0].setAuthor("나관중");
		bookbin[0].setPubulisher("미상");
		bookbin[0].setPubdate("2015-07-03");
		bookbin[0].setPrice(23000);
		bookbin[0].setScore((float) 4.5);
		bookbin[1] = new Book();
		// 값을 채웁니다.
		bookbin[1].setTitle("서유기");
		bookbin[1].setAuthor("오승은");
		bookbin[1].setPubulisher("문지");
		bookbin[1].setPubdate("2014-11-08");
		bookbin[1].setPrice(18000);
		bookbin[1].setScore((float) 4.0);
		bookbin[2] = new Book();
		// 값을 채웁니다.
		bookbin[2].setTitle("수호지");
		bookbin[2].setAuthor("시내암");
		bookbin[2].setPubulisher("믿음");
		bookbin[2].setPubdate("2007-05-26");
		bookbin[2].setPrice(13000);
		bookbin[2].setScore((float) 3.8);
		bookbin[3] = new Book();
		// 값을 채웁니다.
		bookbin[3].setTitle("홍루몽");
		bookbin[3].setAuthor("조설근");
		bookbin[3].setPubulisher("다락");
		bookbin[3].setPubdate("1998-03-15");
		bookbin[3].setPrice(8000);
		bookbin[3].setScore((float) 2.7);
		bookbin[4] = new Book();
		// 값을 채웁니다.
		bookbin[4].setTitle("봉신연의");
		bookbin[4].setAuthor("허중림");
		bookbin[4].setPubulisher("신서");
		bookbin[4].setPubdate("2016-04-22");
		bookbin[4].setPrice(24000);
		bookbin[4].setScore((float) 3.0);

		// 배열의 데이터를 정렬
		// 기본적으로 정렬을 하려면 각 데이터의 크기를 비교할 수 있어야 합니다.
		// java에서 크기를 비교를 하는 메소드는
		// Comparable 인터페이스의 compare 메소드 입니다.
		// 직접 만든 클래스의 경우는 클래스에 Comparable 인터페이스를
		// implements 하던가 Comparator 인터페이스를 implement한
		// 인스턴스를 같이 대입해야 합니다.

		// Comparator 인터페이스를 implements 한 인스턴스 만들기
		// Comparator <Book> comp = new Comparator() {
		//
		// @Override
		// public int compare(Object o1, Object o2) {
		// //데이터 형 변환
		// Book first = (Book)o1;
		// Book second = (Book)o2;
		// return first.getPrice() - second.getPrice();
		// }
		//
		// };
		//
		// Arrays.sort(bookbin, comp);
		//
		// Comparator <Book> comparator = new Comparator() {
		//
		// @Override
		// public int compare(Object o1, Object o2) {
		// Book first = (Book)o1;
		// Book second = (Book)o2;
		// //title을 이용해서 비교
		// return first.getTitle().compareTo(second.getTitle());
		// }
		//
		// };
		//
		// Arrays.sort(bookbin, comparator);

		Scanner sc = new Scanner(System.in);
		while (true) {
			Comparator<Book> comparator = null;
			System.out.print("0:종료 1:가격오름차순 2:가격내림차순");
			int menu = sc.nextInt();
			if (menu == 0) {
				break;
			} else if (menu == 1) {
				comparator = new Comparator() {

					public int compare(Object o1, Object o2) {
						Book book1 = (Book) o1;
						Book book2 = (Book) o2;
						return book1.getPrice() - book2.getPrice();
					}

					
					public int compare(Book o1, Book o2) {
						// TODO Auto-generated method stub
						return 0;
					}
				};
			} else if (menu == 2) {
				comparator = new Comparator() {

					public int compare(Object o1, Object o2) {
						Book book1 = (Book) o1;
						Book book2 = (Book) o2;
						return book2.getPrice() - book1.getPrice();
					}
				};
			}
			Arrays.sort(bookbin, comparator);
			for (Book bookprint : bookbin) {
				System.out.println(bookprint);
			}
			System.out.println("============================");
		}
sc.close();
		// 배열의 데이터 전부 출력
//		for (Book bookprint : bookbin) {
//			System.out.println(bookprint);
//		}
//		System.out.println("============================");
	}

}
