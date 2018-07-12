package etc;

import java.util.StringTokenizer;

public class StringTokenMain {

	public static void main(String[] args) {
		String msg = "오늘 점심은 잼 샌드위치 였어";
		String data = "37,22,45,66";
		//msg를 공백단위로 분할해서 출력
		//1.split 메소드 이용
		String [] ar = msg.split(" ");
		for(String token : ar) {
			System.out.println(token);
		}
		System.out.println("=========================");
		StringTokenizer st = new StringTokenizer(msg," ");
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
		//data를 , 단위로 분할해서 합계를 구하기
		String [] dt = data.split(",");
		int sum = 0;
		for(String datashow : dt) {
			System.out.println(datashow);
		}
		for(String datashow : dt) {
			//잘라진 토큰을 정수로 변환해서 더하기
			sum = sum + Integer.parseInt(datashow);
		}
		System.out.println("합계 : " + sum);

		

	}

}
