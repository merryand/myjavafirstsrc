package datastructure;

import java.util.HashMap;

public class MapMain3 {

	public static void main(String[] args) {
		String[] in = { "농구", "배구" };
		String[] out = { "축구", "야구" };
		String[] two = { "테니스", "배드민턴" };

		// 동일한 의미를 갖는 배열들을 묶을 때 바로 배열이나 리스트로 묶는 것은
		// 바람직하지 않습니다.
		// 배열이나 리스트는 인덱스를 가지고 구분을 하기 때문에
		// 의미를 부여하지 못합니다.
		// 배열이나 리스트를 다시 배열이나 리스트로 묶을 때는 먼저 Map으로
		// 의미를 부여해서 묶은 다음 다시 배열이나 리스트로 묶으라고 합니다.

		HashMap<String, Object> balls = new HashMap<>();

		balls.put("구분", "실내");
		balls.put("데이터", in);

		HashMap<String, Object> balls2 = new HashMap<>();

		balls2.put("구분", "야외");
		balls2.put("데이터", out);

		HashMap<String, Object> balls3 = new HashMap<>();

		balls3.put("구분", "2인");
		balls3.put("데이터", two);
		
		//내용 추기
		String [] spec = {"폴로", "골프"};
		HashMap<String,Object> balls4 = new HashMap<>();
		balls4.put("구분", "특");
		balls4.put("데이터", spec);

		HashMap[] ball = { balls, balls2, balls3,balls4 };

		for (int i = 0; i < ball.length; i = i + 1) {
			HashMap temp = ball[i];
			System.out.print(temp.get("구분"));
			// 출력을 할 때는 get한 데이터를 형변환하지 않지만
			// 저장을 하거나 사용을 할때는 원래의 자료형으로 강제 형 변환을 해서 사용합니다.
			String[] imsi = (String[]) temp.get("데이터");
			for (int j = 0; j < imsi.length; j = j + 1) {
				System.out.print(imsi[j] + "\t");
			}
			System.out.println("");
		}

	}

}
