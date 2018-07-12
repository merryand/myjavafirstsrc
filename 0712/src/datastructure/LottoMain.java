package datastructure;

import java.util.Random;
import java.util.TreeSet;

public class LottoMain {

	public static void main(String[] args) {
		// 1부터 45까지의 숫자 6개를 랜덤하게 저장해서 출력
		//랜덤한 숫자를 얻어내기 위해서 랜덤 인스턴스를 생성
		Random r =new Random();
		TreeSet <Integer> lotto = new TreeSet<>();
		while(lotto.size() < 6) {
			lotto.add(r.nextInt(45)+1);
		}
		for(int x : lotto) {
			System.out.println(x);
		}
//		int [] lotto = new int [6];
		
//		for(int i = 0; i<6; i=i+1) {
//			lotto[i] = r.nextInt(45)+1;
//			int j = 0;
//			for(j=0; j<=i-1; j=j+1) {
//				if(lotto[i] == lotto[j]) {
//					break;
//				}
//			}
//			if(i != j) {
//				i = i-1;
//			}
//		}
		
	}

}
