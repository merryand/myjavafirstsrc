import java.util.ArrayList;
import java.util.List;

public class LamdbaMain {
	
	interface T{
		public void method(int n);
	}
	interface V {
	 	public int add(int n1, int n2);
	}

	public static void main(String[] args) {
		//위와 같은 인터페이스 T를 구현해서 사용해야 하는 경우
		T ob1 = (n) -> {
			System.out.println("n :" + n);
		};
		
		ob1.method(10);
		
		V ob = (n1, n2) -> {
			return n1+ n2;
		};
		
		System.out.println(ob.add(100, 3000));
		
		//배열은 [인덱스]를 통해서 각각의 데이터에 접근합니다.
		int [] ar = {10,20,30};
		
		for (int i =0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
		//ar의 모든 요소를 temp에 대입해서 하나씩 수행합니다.
		//for - each를 이용한 배열의 데이터 접근
		for(int temp : ar) {
			System.out.println(temp);
		}
		
		System.out.println("======================");
		
		//List는 get(인덱스)를 통해서 각각의 데이터에 접근합니다.
		List<Integer> list = new ArrayList<>();
		
		list.add(30);
		list.add(70);
		list.add(40);
		
		for(int i = 0; i <list.size(); i = i+1) {
			System.out.println(list.get(i));
		}

	}
}
