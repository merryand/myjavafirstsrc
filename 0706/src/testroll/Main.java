package testroll;

public class Main {

	public static void main(String[] args) {

		int [] ar = {10,30,70,40,15};
		int size = ar.length;
		int idx = 0;
		int max = ar[0];
		int i;
		
		for(i = 1; i <size; i = i+1) {
			if(max < ar[i]) {
				max = ar[i];
				idx = i;
			}
		}
		System.out.println("가장 큰 수가 든 배열의 위치는 ar [" + idx + "]");
	}
}