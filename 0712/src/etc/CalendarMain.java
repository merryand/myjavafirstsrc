package etc;

import java.util.Calendar;

public class CalendarMain {

	public static void main(String[] args) {
		// 1991년 1월 31일 Calendar 객체로 만들기
		Calendar birth = Calendar.getInstance();
		birth.set(Calendar.YEAR, 1991);
		birth.set(Calendar.MONTH, 0);
		birth.set(Calendar.DAY_OF_MONTH, 31);
		//System.out.pritln(birth);
		//Date date = new Date(birth.getTimeInMillis());
		//System.out.println(date);
		
		Calendar toDay = Calendar.getInstance();
		long gap =
				toDay.getTimeInMillis() - birth.getTimeInMillis();
		System.out.println("태어난 지 " + (gap/24/60/60/1000) + "일 째 되는 날 입니다.");

	}

}
