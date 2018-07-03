package method;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
/*		
		Scanner sc = new Scanner(System.in);				
		
		// Member클래스의 인스턴스 생성
		Member member1 = new Member();
		//인스턴스 변수를 호출해서 데이터 저장

		System.out.println("이메일:");
		String email = sc.nextLine();
		member1.setEmail(email);
		System.out.println("패스워드:");
		String password = sc.nextLine();
		member1.setPassword(password);
		System.out.println("닉네임:");
		String nickname = sc.nextLine();
		member1.setNickname(nickname);
		System.out.println("나이:");
		int age = sc.nextInt();
		member1.setAge(age);
		sc.close();

		System.out.println("이름" + member1.getEmail() + "\t" + "비밀번호" + member1.getPassword() + "\t" + "닉네임" + member1.getNickname() + "\t" + "나이" + member1.getAge());

		member1.display();
		
		System.out.println(member1);
*/		
		System.out.println(Member.sum(10,20));
		System.out.println(Member.sum(10,20,30));
		System.out.println(Member.sum(10));
		
		long m = Math.max(100,200);
		System.out.println(m);
	}

}
