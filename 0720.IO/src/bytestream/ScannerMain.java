package bytestream;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		//��
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.println(name);
		
		System.out.print("���� : ");
		int x =sc.nextInt();
		System.out.println(x);
		
		//�ȉ�
//		System.out.print("�̸� : ");
//		String name = sc.nextLine();
//		System.out.println(name);
		
		sc.close();

	}

}
