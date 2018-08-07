import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {
		StudentDAO dao =new StudentDAO();
		List<StudentVO> list = dao.fetch();
		//System.out.println(list);
		/*
		for(StudentVO vo : list) {
			//����ϴ� �޼ҵ忡 �ν��Ͻ� �̸��� �����ϸ� toString�� ���
			System.out.println(vo);
		}
		*/
		
		//Stream ����
		Stream<StudentVO> stream = list.stream();
		//�����͸� 2�� �ǳʶ�� 3�� ���
		//stream.skip(2).limit(3).forEach(data -> System.out.println(data));
		
		//������ �����͸� ���
		//stream.filter(data -> data.getGender().equals("����")).forEach(data -> System.out.println(data));
		
		//������ �����ϱ� - score
		//stream.sorted((d1, d2) -> d2.getScore() - d1.getScore()).forEach(data -> System.out.println(data));
		
		//���ڿ��� ��¥�� compareTo��
		//stream.sorted((c1,c2) -> c1.getSubject().compareTo(c2.getSubject())).forEach(data -> System.out.println(data));
		
		/*
		long cnt = stream.count();
		System.out.println(cnt);

		
		//Optional�� ���ϵǴ� �����ʹ� �� �� �� ������ �ؾ� �մϴ�.
		StudentVO vo = stream.findFirst().get();
		System.out.println(vo);

		
		//score�� �հ� ���ϱ�
		//���� �����Ͱ� �ƴϸ� �ٷ� �հ踦 ���� �� ���� ������
		//map �޼ҵ带 �̿��ؼ� ���� �����ͷ� ������ �� �հ踦 ���ؾ� �մϴ�.
		int sum = stream.mapToInt(StudentVO::getScore).sum();
		System.out.println("�հ� : " + sum);
		
		//age�� ��� ���ϱ�
		double avgage = stream.mapToInt(StudentVO::getAge).average().getAsDouble();
		System.out.println("���� ��� : " + avgage);
		
		//������ ������ �������� ��� ������ ���ϴµ� �Ҽ� 1°�ڸ��� �ݿø��ؼ� �����κи� ���
		double manavg = stream.filter(data -> data.getGender().equals("����")).mapToInt(StudentVO::getScore).average().getAsDouble();
		int score = (int)(manavg+ 0.5);
		System.out.println("���� ��� ���� : " + score);
		
		//������ ������ �����͸� ������ list�� ����
		List<StudentVO> list2 = stream.filter(data -> data.getGender().equals("����")).collect(Collectors.toList());
		for(StudentVO vo : list2) {
			System.out.println(vo);
		}
		
		//�̸��� �������� ���� Map���� ����
		Map<String, Integer> map = stream.collect(Collectors.toMap(StudentVO::getName, StudentVO::getScore));
		System.out.println(map);
		
		
		//������ �����̰� score�� 90 �̻��� �������� list �����ϱ�
		List<StudentVO> list3 = stream.filter(data -> data.getGender().equals("����") && data.getScore() >= 90).collect(Collectors.toList());
		System.out.println(list3);

		
		//groupingBy�� �ۼ��� �Լ��� ����� key�� �ϰ�
		//���� �������� list�� ������ �ؼ� Map���� �����մϴ�.
		Map<String, List<StudentVO>> map =
		stream.collect(Collectors.groupingBy(StudentVO::getGender));
		System.out.println(map);
		
		
		Map<String, IntSummaryStatistics> map = stream.collect(Collectors.groupingBy(StudentVO::getGender,Collectors.summarizingInt(StudentVO::getScore)));
		*/
		
		//gender ���� score�� �հ踦 ������ ���
		Map<String, Integer> map = stream.collect(Collectors.groupingBy(StudentVO::getGender,Collectors.summingInt(StudentVO::getScore)));
		
		//Map�� ������ ���� ����ϱ�
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			System.out.println(key + " : " + map.get(key));
		}
		
	}

}
