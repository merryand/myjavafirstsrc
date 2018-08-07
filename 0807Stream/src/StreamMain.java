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
			//출력하는 메소드에 인스턴스 이름을 대입하면 toString의 결과
			System.out.println(vo);
		}
		*/
		
		//Stream 생성
		Stream<StudentVO> stream = list.stream();
		//데이터를 2개 건너띄고 3개 출력
		//stream.skip(2).limit(3).forEach(data -> System.out.println(data));
		
		//남자인 데이터만 출력
		//stream.filter(data -> data.getGender().equals("남자")).forEach(data -> System.out.println(data));
		
		//데이터 정렬하기 - score
		//stream.sorted((d1, d2) -> d2.getScore() - d1.getScore()).forEach(data -> System.out.println(data));
		
		//문자열과 날짜는 compareTo로
		//stream.sorted((c1,c2) -> c1.getSubject().compareTo(c2.getSubject())).forEach(data -> System.out.println(data));
		
		/*
		long cnt = stream.count();
		System.out.println(cnt);

		
		//Optional로 리턴되는 데이터는 한 번 더 가공을 해야 합니다.
		StudentVO vo = stream.findFirst().get();
		System.out.println(vo);

		
		//score의 합계 구하기
		//숫자 데이터가 아니면 바로 합계를 구할 수 없기 때문에
		//map 메소드를 이용해서 숫자 데이터로 변경항 후 합계를 구해야 합니다.
		int sum = stream.mapToInt(StudentVO::getScore).sum();
		System.out.println("합계 : " + sum);
		
		//age의 평균 구하기
		double avgage = stream.mapToInt(StudentVO::getAge).average().getAsDouble();
		System.out.println("나이 평균 : " + avgage);
		
		//성별이 남자인 데이터의 평균 점수를 구하는데 소수 1째자리로 반올림해서 정수부분만 출력
		double manavg = stream.filter(data -> data.getGender().equals("남자")).mapToInt(StudentVO::getScore).average().getAsDouble();
		int score = (int)(manavg+ 0.5);
		System.out.println("남자 평균 점수 : " + score);
		
		//성별이 여자인 데이터만 가지고 list를 생성
		List<StudentVO> list2 = stream.filter(data -> data.getGender().equals("여자")).collect(Collectors.toList());
		for(StudentVO vo : list2) {
			System.out.println(vo);
		}
		
		//이름과 점수만을 갖는 Map으로 생성
		Map<String, Integer> map = stream.collect(Collectors.toMap(StudentVO::getName, StudentVO::getScore));
		System.out.println(map);
		
		
		//성별이 남자이고 score가 90 이상인 데이터의 list 생성하기
		List<StudentVO> list3 = stream.filter(data -> data.getGender().equals("남자") && data.getScore() >= 90).collect(Collectors.toList());
		System.out.println(list3);

		
		//groupingBy에 작성한 함수의 결과를 key로 하고
		//원래 데이터의 list를 값으로 해서 Map으로 리턴합니다.
		Map<String, List<StudentVO>> map =
		stream.collect(Collectors.groupingBy(StudentVO::getGender));
		System.out.println(map);
		
		
		Map<String, IntSummaryStatistics> map = stream.collect(Collectors.groupingBy(StudentVO::getGender,Collectors.summarizingInt(StudentVO::getScore)));
		*/
		
		//gender 별로 score의 합계를 정수로 출력
		Map<String, Integer> map = stream.collect(Collectors.groupingBy(StudentVO::getGender,Collectors.summingInt(StudentVO::getScore)));
		
		//Map의 데이터 전부 출력하기
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			System.out.println(key + " : " + map.get(key));
		}
		
	}

}
