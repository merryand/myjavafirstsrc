package oracleuse;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

public class ContactMain {

	public static void main(String[] args) {
		new ContactView();
		//인터페이스나 클래스를 상속한 경우에는
		//상위 인터페이스나 클래스를 이름으로 변수를 만들고
		//하위 클래스의 인스턴스를 생성해서 대입합니다.
//		ContactDao dao = new ContactDaoImpl();
//		List<Contact> list = dao.nameContact("제");
////		List<Contact> list = dao.readAllContact();
//		for(Contact contact : list) {
//			System.out.println(contact);
//		}
//		
//		Contact contact = new Contact();
//		contact.setNum(1);
//		contact.setName("제시카");
//		contact.setPhone("01037011997");
//		contact.setEmail("jessica72@gmail.com");
//		//현재 시간을 저장한 캘린더 생성
//		Calendar cal = Calendar.getInstance();
//		cal.set(Calendar.YEAR, 1972);
//		cal.set(Calendar.MONTH,4);
//		cal.set(Calendar.DAY_OF_MONTH,27);
//		Date birthDay = new Date(cal.getTimeInMillis());
//		contact.setBirthday(birthDay);
//		
//		boolean r = dao.deleteContact(2);
//		if(r == true) {
//			System.out.println("삭제 성공");
//		}else{
//			System.out.println("삭제 실패");
//		}
		
		
//		boolean r = dao.updateContact(contact);
//		if(r == true) {
//			System.out.println("업데이트 성공");
//		}else {
//			System.out.println("업데이트 실패");
//		}
		
		//데이터를 삽입하는 메소드 호출
//		boolean result = dao.insertContact(contact);
//		if(result == true) {
//			System.out.println("삽입성공");
//		}else {
//			System.out.println("삽입실패");
//		}
		
	}

}
