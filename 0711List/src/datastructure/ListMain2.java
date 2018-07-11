package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain2 {

	public static void main(String[] args) {
		// 정수를 저장하는 ArrayList와 LinkedList를 만들고
		//중간에 데이터를 10만개 삽입하는데 걸리는 시간을 측정
		ArrayList<Integer>al = new ArrayList<>();
		LinkedList<Integer>li = new LinkedList<>();
		
		al.add(1);
		al.add(3);
		al.add(4);
		
		li.add(1);
		li.add(3);
		li.add(4);
		
		//al에 10만개를 중간에 넣고 시간 측정
		long start = System.currentTimeMillis();
		for(int i=0; i<100000; i=i+1) {
			//첫번째 자리에 2를 추가
			al.add(1,2);
		}
		long end = System.currentTimeMillis();
		System.out.println("al : "+(end-start));
		start = System.currentTimeMillis(); //만든 인스턴스 재활용
		for(int i=0; i<100000; i=i+1) {
			//첫번째 자리에 2를 추가
			li.add(1,2);
		}
		end = System.currentTimeMillis();
		System.out.println("li : "+(end-start)); //인스턴스를 같은 이름으로 두 번 만들어서 오류났었음

		//읽는 시간
		start = System.currentTimeMillis();
		for(int i=0; i<100000; i=i+1) {
			al.get(i);
		}
		end = System.currentTimeMillis();
		System.out.println("al : "+(end-start));
		start = System.currentTimeMillis();
		for(int i=0; i<100000; i=i+1) {
			li.get(i);
		}
		end = System.currentTimeMillis();
		System.out.println("li : "+(end-start));
	}

}
