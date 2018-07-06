package exceptionhandling;

public class Main3 {

	public static void main(String[] args) {

		// image0.png, image1.png, image2.png
		// 위 3개의 문자열 1초마다 번갈아가면서 무한 반복해서 출력하는 문제

		/*
		 * int idx = 0; for (;;) { System.out.println("image" + (idx % 3) + ".png"); try
		 * { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace();
		 * } idx = idx + 1;
		 * 
		 * }
		 */

		// 김기태, 이종범, 최향남, 이대진을 번갈아 가면서 출력.

		String[] ar = { "김기태", "이종범", "최향남", "이대진" };
		int size = ar.length;
		int name = 0;
		try {
		while (true) {
			System.out.println(ar[name % size]);
			name = name + 1;
				Thread.sleep(1000);
		}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
