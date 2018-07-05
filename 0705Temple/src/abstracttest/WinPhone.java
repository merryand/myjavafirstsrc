package abstracttest;

public class WinPhone extends SmartPhone {

	@Override
	public void call() {
		int time = 132400;
		//위에 저장된 값이 초라고 가정하고 몇시간 몇분 몇 초인지 출력
		int hour = time/3600;
		//int minute = (time-(3600*hour))/60;
		int minute = (time % 3600)/60;
		//int second = (time-((3600*hour)+(minute*60)));
		int second = time % 60;
		
		System.out.println(hour + "시간" + minute + "분" + second +"초");

	}

}
