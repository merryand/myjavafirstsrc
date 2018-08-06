import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain1 {

	public static void main(String[] args) {
		// 문자열 배열을 생성
		String [] ar = {"복숭아","수박","참외"};
		int [] numar = {1,2,3,4,5,};
		
		//문자열 리스트를 생성
		List <String> person = new ArrayList<String>();
		person.add("유재석");
		person.add("하하");
		person.add("박명수");
		person.add("정준하");
		
		//문자열 배열을 가지고 스트림 만들기
		Stream<String> stream = Arrays.stream(ar);
		//작업 수행
		stream.forEach(summer -> {System.out.println(summer);});
		
		IntStream stream2 = Arrays.stream(numar);
		//작업 수행
		stream2.forEach(number -> {System.out.println(number);});
		
		//List를 가지고 스트림 만들기
		stream = person.stream();
		stream.forEach(name -> {System.out.println(name);});

	}

}
