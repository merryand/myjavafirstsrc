package practice;

public class Problem3 {

	public static void main(String[] args) {
		int [] [] ar = new int[5][5];
		int cnt = 1;
		
		for(int i =0; i <5; i=i+1) {
			for(int j = 0; j<5; j=j+1) {
				ar[i][j] = cnt;
				cnt = cnt+1;
			}
		}
		
		
		for(int i =0; i <25; i=i+1) {
			System.out.printf("%3d", ar[i/5][i%5]);
			if(i%5 == 4) System.out.printf("\n");
		}

	}

}
