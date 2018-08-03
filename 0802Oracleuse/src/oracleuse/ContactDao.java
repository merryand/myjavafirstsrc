package oracleuse;

import java.util.List;

public interface ContactDao {
	//������ ���и� �˷���� �ؼ� boolean���� return��
	
	//�����͸� �����ϴ� �޼ҵ�
	public boolean insertContact (Contact contact);
	
	//�����͸� �����ϴ� �޼ҵ�
	public boolean updateContact(Contact contact);
	
	//�����͸� �����ϴ� �޼ҵ�
	public boolean deleteContact(int num);
	
	//������ ��ü�� �о���� �޼ҵ�
	//�����Ͱ� 0�� �̻��̹Ƿ� List�� �����ϰ� �о�� �÷����� ������
	//DTO Ŭ������ Map���� ���ʸ��� �����ϸ� �˴ϴ�.
	public List<Contact> readAllContact();
	
	//�̸��� ������ ��ȸ�ϴ� �޼ҵ�
	public List<Contact> nameContact(String name);

}
