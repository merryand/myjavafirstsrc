package datastructure;

import java.util.PriorityQueue;
import java.util.Stack;

public class ListMain5 {

	public static void main(String[] args) {
		Stack <String> stack = new Stack<>();
		stack.push("c");
		stack.push("c++");
		stack.push("Phthon");
		stack.push("Java");
		//데이터가 역순으로 리턴됩니다. - 제거되면서 리턴
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		//우선 순의 큐 만들기
		PriorityQueue <String> queue = new PriorityQueue<>();
		queue.add("Oracle");
		queue.add("MySQL");
		queue.add("MSSQL");
		queue.add("Mongo DB");
		queue.add("Casandra");
		System.out.println(queue);
		//크기가 작은 것부터 리턴 - Casandra, MSSQL 순으로 출력
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		
	}

}
