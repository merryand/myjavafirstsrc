import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain3 {

	public static void main(String[] args) {
		//Student Ŭ������ �ν��Ͻ��� �迭
		//5���� �迭�� ������� �� �ƴϰ�, 5���� �ּҸ� ������ ������ ���� ��. null�� 5��
		Student [] ar = new Student[5];
		ar[0] = new Student("��������", "����", 98, 24, "��ǻ�Ͱ��а�");
		ar[1] = new Student("�����ҹ�", "����", 77, 27, "���꺸�Ȱ�");
		ar[2] = new Student("�Ҽ���", "����", 84, 26, "�ǻ�����ΰ�");
		ar[3] = new Student("�����", "����", 100, 32, "��ǻ�Ͱ��а�");
		ar[4] = new Student("��Ȳ��", "����", 85, 34, "���꺸�Ȱ�");
		
		//���� ������ �������� ����
		Stream<Student> stream3 = Arrays.stream(ar);
		stream3.sorted((n1,n2 ) -> n1.getName().compareTo(n2.getName())).forEach(student -> System.out.println(student));
		
		//���� ������ �������� ����
		Stream<Student> stream4 = Arrays.stream(ar);
		stream4.sorted((n1,n2 ) -> n2.getAge() - n1.getAge()).forEach(student -> System.out.println(student));
		
		int [] array = {30,20,31,78,12};
		IntStream stream = Arrays.stream(array);
		stream.sorted().forEach(su -> System.out.println(su));
		
		String [] insa = {
				"Mornig", "Afternoon", "Evening", "Night"
		};
		//���ڿ� �迭�� �����ؼ� ���
		Stream <String> s = Arrays.stream(insa);
		//s.sorted().forEach(su -> System.out.println(su));
		//�������� ���
		s.sorted((n1, n2) -> n2.compareTo(n1)).forEach(su -> System.out.println(su));
		
		/*
		//Student�� score�� ����
		Stream<Student> stream = Arrays.stream(ar);
		stream.mapToInt(Student::getScore).forEach(student -> System.out.println(student));
		
		*/
		/*
		//������ ������ �����͸� ���
		Stream<Student> stream = Arrays.stream(ar);
		stream.filter(student -> student.getGender().equals("����")).forEach(student -> System.out.println(student));
		
		//������ �����̰� ���̰� 30�̻��� ������
		Stream<Student> stream2 = Arrays.stream(ar);
		stream2.filter(student -> student.getGender().equals("����") && student.getAge() >= 30).forEach(student -> System.out.println(student));
		*/
		
		/*
		Student student = new Student();
		student.setName("������");
		student.setGender("����");
		student.setAge(24);
		student.setScore(97);
		student.setSubject("��ȸü���а�");
		
		
		//���� ������ �̷��� ���� �� �� ���� ������, �ν��Ͻ� ȣ���� ���� �Ѵٴ� ������ ����
		Student student1 = new Student("������", "����", 92, 25, "���ڰ���а�");
		
		System.out.println(student);
		System.out.println(student1);
*/
	}

}
