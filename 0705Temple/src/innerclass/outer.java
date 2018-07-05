package innerclass;

public class outer {
	//일반 inner class : 클래스 안에 존재하는 클래스
//	class inner{
//		
//	}
	//static inner class : 내부 클래스 안에 static 멤버가 있으면
	//일반 inner class는 에러를 발생시킵니다.
	// 이 때는 class 앞에 static을 붙여 주어야 합니다.
	
//	static class Inner {
//		static int n;
//	}
//	
	//local inner class: 메소드 안에 만드는 클래스
	//메소드가 호출되서 실행될 때 만들어졌다가 없어지는 클래스
	//클래스가 메소드를 호출할 때 만 존재하기 때문에 메모리 효율을 높일 수도 있습니다.
	public void sample() {
		class Inner{
			
		}
	}

}
