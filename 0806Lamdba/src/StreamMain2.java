import java.util.Arrays;
import java.util.stream.Stream;

public class StreamMain2 {

	public static void main(String[] args) {
		String [] ar =
			{
					"김좌진", "김원봉", "남자현", "안중근", "신채호", "안창호", "홍범도", "윤봉길", "이봉창"
			};
		//스트림 변환
		Stream<String> stream = Arrays.stream(ar);
		//모든 데이터 출력
		//stream.forEach(name -> {System.out.println(name);});
		//중복제거
		//stream.distinct().skip(2).limit(3).forEach(name -> {System.out.println(name);});
		
		//김으로 시작하는 데이터만 찾아서 출력
		//return 문장 하나 밖에 없을 때는 return이라는 단어를 생략가능
		//수행되는 코드가 한 줄 일 때는 {} 생략 가능
		//stream.filter(name -> name.startsWith("김")).forEach(name -> {System.out.println(name);});
		//3글자인 이름만 출력
		//stream.filter(name -> name.length() == 3).forEach(name -> {System.out.println(name);});
		
		stream.filter(name -> name.endsWith("호")).forEach(name -> {System.out.println(name);});

	}

}
