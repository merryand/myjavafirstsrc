package oracleuse;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

public class ContactMain {

	public static void main(String[] args) {
		new ContactView();
		//�������̽��� Ŭ������ ����� ��쿡��
		//���� �������̽��� Ŭ������ �̸����� ������ �����
		//���� Ŭ������ �ν��Ͻ��� �����ؼ� �����մϴ�.
//		ContactDao dao = new ContactDaoImpl();
//		List<Contact> list = dao.nameContact("��");
////		List<Contact> list = dao.readAllContact();
//		for(Contact contact : list) {
//			System.out.println(contact);
//		}
//		
//		Contact contact = new Contact();
//		contact.setNum(1);
//		contact.setName("����ī");
//		contact.setPhone("01037011997");
//		contact.setEmail("jessica72@gmail.com");
//		//���� �ð��� ������ Ķ���� ����
//		Calendar cal = Calendar.getInstance();
//		cal.set(Calendar.YEAR, 1972);
//		cal.set(Calendar.MONTH,4);
//		cal.set(Calendar.DAY_OF_MONTH,27);
//		Date birthDay = new Date(cal.getTimeInMillis());
//		contact.setBirthday(birthDay);
//		
//		boolean r = dao.deleteContact(2);
//		if(r == true) {
//			System.out.println("���� ����");
//		}else{
//			System.out.println("���� ����");
//		}
		
		
//		boolean r = dao.updateContact(contact);
//		if(r == true) {
//			System.out.println("������Ʈ ����");
//		}else {
//			System.out.println("������Ʈ ����");
//		}
		
		//�����͸� �����ϴ� �޼ҵ� ȣ��
//		boolean result = dao.insertContact(contact);
//		if(result == true) {
//			System.out.println("���Լ���");
//		}else {
//			System.out.println("���Խ���");
//		}
		
	}

}
