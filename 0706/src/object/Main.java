package object;

public class Main {

	public static void main(String[] args) {
		// Car 클래스의 인스턴스를 생성해서 데이터를 저장
		Car car1 = new Car();
		car1.setModelName("그랜져");
		car1.setDisplacement(2400);
		car1.setPrice(2200);
		//toString을 호출해서 출력
//		System.out.println(car1.toString());
//		System.out.println(car1);
		
		Car car2 = new Car();
		car2.setModelName("그랜져");
		car2.setDisplacement(3000);
		car2.setPrice(2900);
		
		System.out.println(car1 == car2);

	}

}
