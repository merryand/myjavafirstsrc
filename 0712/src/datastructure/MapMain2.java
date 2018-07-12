package datastructure;

public class MapMain2 {

	public static void main(String[] args) {
		// 구기 종목 배열
		String [] in = {"농구", "배구"};
		String [] out = {"축구","야구"};
		String [] two = {"테니스","배드민턴"};
		String [] spec = {"폴로", "골프"};
		
		//String 배열의 배열로 묶기
		String [] [] balls = { in, out, two, spec};
		
		//이차원 배열의 데이터 출력
		//큰 배열에 포함된 작은 배열의 데이터 개수만큼 반복
		for(int i =0; i <balls.length; i = i+1) {
			
			if(i==0) {
				System.out.print("실내 : " + "\t");
			}
			else if(i==1) {
				System.out.print("야외 : " + "\t");
			}
			else if(i==2) {
				System.out.print("2인 : " + "\t");
			}
			else if(i==3) {
				System.out.print("특별 : " + "\t");
			}
			
			
			//작은 배열을 순서대로 가져오기
			String [] imsi = balls[i];
			//작은 배열에 데이터 개수만큼 반복
			for(int j = 0; j<imsi.length; j=j+1) {
				System.out.print(imsi[j] + "\t");
			}
			System.out.println("");
		}

	}

}
