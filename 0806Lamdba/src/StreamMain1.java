import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain1 {

	public static void main(String[] args) {
		// ���ڿ� �迭�� ����
		String [] ar = {"������","����","����"};
		int [] numar = {1,2,3,4,5,};
		
		//���ڿ� ����Ʈ�� ����
		List <String> person = new ArrayList<String>();
		person.add("���缮");
		person.add("����");
		person.add("�ڸ��");
		person.add("������");
		
		//���ڿ� �迭�� ������ ��Ʈ�� �����
		Stream<String> stream = Arrays.stream(ar);
		//�۾� ����
		stream.forEach(summer -> {System.out.println(summer);});
		
		IntStream stream2 = Arrays.stream(numar);
		//�۾� ����
		stream2.forEach(number -> {System.out.println(number);});
		
		//List�� ������ ��Ʈ�� �����
		stream = person.stream();
		stream.forEach(name -> {System.out.println(name);});

	}

}
