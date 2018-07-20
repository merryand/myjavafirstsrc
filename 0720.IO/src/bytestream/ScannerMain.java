package bytestream;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		//됌
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.println(name);
		
		System.out.print("정수 : ");
		int x =sc.nextInt();
		System.out.println(x);
		
		//안됌
//		System.out.print("이름 : ");
//		String name = sc.nextLine();
//		System.out.println(name);
		
		sc.close();

	}

}
