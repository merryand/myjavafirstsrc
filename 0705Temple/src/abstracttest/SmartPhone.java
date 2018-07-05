package abstracttest;

//Android와 Iphone 클래스의 주소를 하나의 변수에 저장할 수 있도록
//하기 위해서 작성한 클래스 - 인스턴스를 생성할 필요 없음
//추상 클래스 : 인스턴스를 만들 수 없는 클래스
public abstract class SmartPhone {
	//하위 클래스의 메소드와 오버라이딩 관계를 만들기 위해서 생성한 메소드
	//추상 메소드 : 내용이 없는 메소드를 상속받은 곳에서 반드시 재정의 해야합니다.
	public abstract void call();

}
