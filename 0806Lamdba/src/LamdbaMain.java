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
		//���� ���� �������̽� T�� �����ؼ� ����ؾ� �ϴ� ���
		T ob1 = (n) -> {
			System.out.println("n :" + n);
		};
		
		ob1.method(10);
		
		V ob = (n1, n2) -> {
			return n1+ n2;
		};
		
		System.out.println(ob.add(100, 3000));
		
		//�迭�� [�ε���]�� ���ؼ� ������ �����Ϳ� �����մϴ�.
		int [] ar = {10,20,30};
		
		for (int i =0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
		//ar�� ��� ��Ҹ� temp�� �����ؼ� �ϳ��� �����մϴ�.
		//for - each�� �̿��� �迭�� ������ ����
		for(int temp : ar) {
			System.out.println(temp);
		}
		
		System.out.println("======================");
		
		//List�� get(�ε���)�� ���ؼ� ������ �����Ϳ� �����մϴ�.
		List<Integer> list = new ArrayList<>();
		
		list.add(30);
		list.add(70);
		list.add(40);
		
		for(int i = 0; i <list.size(); i = i+1) {
			System.out.println(list.get(i));
		}

	}
}
