package interfacetest;

//MemberService 인터페이스를 implement한 클래스를 생성
//하나의 인터페이스를 implement한 클래스의 이름은 인터페이스 이름 뒤에
//Impl을 붙이는 것이 관례입니다.

// 인터페이스를 저장을 안하고 자동생성했더니 죄다 오류 떴었음
public class MemberServiceImpl implements MemberService {

	@Override
	public boolean idCheck(String id) {
		 boolean result = false;
		 
		 //id가 root가 아니라면 true
		 if(id.equals("root") == false) {
			 result = true;
		 } 
		return result;
	}

	@Override
	public int login(String id, String password) {
		//id가 root이고 password가 1234면 로그인 성공 - 0
		//id가 root이고 password가 1234가 아니면 비밀번호가 틀림 - 1
		//id가 root가 아니면 없는 id - 2
		
		int result = 2;
		
		if(id.equals("root")) {
			if(password.equals("1234")) {
				result = 0;
			}
			else {
				result = 1;
			}
		}
		return result;
	}

}
