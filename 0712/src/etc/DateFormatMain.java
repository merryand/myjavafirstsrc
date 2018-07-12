package etc;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatMain {

	public static void main(String[] args) {
		Date date = new Date();
		int money = 3309000;
		//0000년 00월 00일 요일 00시 00분 00초 형식으로 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 mm월 dd일 EEEE a hh시 mm분 ss초");
		//요일은 대문자로 해야 하는가보다. EEE로 쓰면, 한글로 한자만... 요일은 빠지고 나옴
		String msg = sdf.format(date);
		System.out.println(msg);
		
		//3,309,000로 출력
		DecimalFormat df = new DecimalFormat("\u00A4 #,##0");
		msg = df.format(money);
		System.out.println(msg);

	}

}
