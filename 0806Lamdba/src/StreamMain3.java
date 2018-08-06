import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain3 {

	public static void main(String[] args) {
		//Student 클래스의 인스턴스의 배열
		//5개의 배열이 만들어진 게 아니고, 5개의 주소를 저장할 공간이 생긴 것. null만 5개
		Student [] ar = new Student[5];
		ar[0] = new Student("을지문덕", "남자", 98, 24, "컴퓨터공학과");
		ar[1] = new Student("연개소문", "남자", 77, 27, "전산보안과");
		ar[2] = new Student("소서노", "여자", 84, 26, "의상디자인과");
		ar[3] = new Student("김수로", "남자", 100, 32, "컴퓨터공학과");
		ar[4] = new Student("허황옥", "여자", 85, 34, "전산보안과");
		
		//글자 순으로 오름차순 정렬
		Stream<Student> stream3 = Arrays.stream(ar);
		stream3.sorted((n1,n2 ) -> n1.getName().compareTo(n2.getName())).forEach(student -> System.out.println(student));
		
		//나이 순으로 내림차순 정렬
		Stream<Student> stream4 = Arrays.stream(ar);
		stream4.sorted((n1,n2 ) -> n2.getAge() - n1.getAge()).forEach(student -> System.out.println(student));
		
		int [] array = {30,20,31,78,12};
		IntStream stream = Arrays.stream(array);
		stream.sorted().forEach(su -> System.out.println(su));
		
		String [] insa = {
				"Mornig", "Afternoon", "Evening", "Night"
		};
		//문자열 배열을 정렬해서 출력
		Stream <String> s = Arrays.stream(insa);
		//s.sorted().forEach(su -> System.out.println(su));
		//내림차순 출력
		s.sorted((n1, n2) -> n2.compareTo(n1)).forEach(su -> System.out.println(su));
		
		/*
		//Student를 score로 변경
		Stream<Student> stream = Arrays.stream(ar);
		stream.mapToInt(Student::getScore).forEach(student -> System.out.println(student));
		
		*/
		/*
		//성별이 남자인 데이터만 출력
		Stream<Student> stream = Arrays.stream(ar);
		stream.filter(student -> student.getGender().equals("남자")).forEach(student -> System.out.println(student));
		
		//성별이 여자이고 나이가 30이상인 데이터
		Stream<Student> stream2 = Arrays.stream(ar);
		stream2.filter(student -> student.getGender().equals("여자") && student.getAge() >= 30).forEach(student -> System.out.println(student));
		*/
		
		/*
		Student student = new Student();
		student.setName("강감찬");
		student.setGender("남자");
		student.setAge(24);
		student.setScore(97);
		student.setSubject("사회체육학과");
		
		
		//실제 오류는 이렇게 만든 게 더 많이 나지만, 인스턴스 호출을 적게 한다는 장점이 있음
		Student student1 = new Student("남자현", "여자", 92, 25, "전자계산학과");
		
		System.out.println(student);
		System.out.println(student1);
*/
	}

}
