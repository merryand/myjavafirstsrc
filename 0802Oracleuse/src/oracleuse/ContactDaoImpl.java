package oracleuse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ContactDaoImpl implements ContactDao {
	// ��� �޼ҵ忡�� �������� ����� ���� ����
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;

	// �����ͺ��̽� ������ �����ϴ� �޼ҵ�
	private void connect() {
		try {
			// ����̹� Ŭ���� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// �����ͺ��̽� ����
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	private void close() {
				try {
					if (rs != null)
						rs.close();
					if (pstmt != null)
						pstmt.close();
					if (con != null)
						con.close();
				} catch (Exception e) {}
	}

	// ���� ū num�� ã�ƿ��� �޼ҵ�
	// sql : select max(num) from contact
	private int getMaxNum() {
		int result = 0;
		
		// Connection con = null;
		// PreparedStatement pstmt = null;
		// select ������ ����� �����ϱ� ���� ����
		 //ResultSet rs = null;

		try {

			connect();
			// Class.forName("oracle.jdbc.driver.OracleDriver");
			// con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
			// "scott", "tiger");
			// //���� ū �۹�ȣ�� ã�ƿ��� sql�� �����ϴ� ��ü ����
			 pstmt = con.prepareStatement("select max(num) from contact");
			// sql ����
			rs = pstmt.executeQuery();

			// ��� �б�
			while (rs.next()) {
				// select ���� ù��° �÷��� ���� ������ �о
				// result�� ����
				result = rs.getInt(1);
			}


//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		} finally {
//			try {
//				if (rs != null)
//					rs.close();
//				if (pstmt != null)
//					pstmt.close();
//				if (con != null)
//					con.close();
//
//			} catch (Exception e) {
//			}
//		}
			close();
		}catch(Exception e) {}
		return result;
	}

	@Override
	//�����͸� �����ϴ� �޼ҵ�
	public boolean insertContact(Contact contact) {
		boolean result = false;

		//Connection con = null;
		//PreparedStatement pstmt = null;
		try {
			//���� ū ��ȣ�� ã�ƿ��� SQL�� ����
			int maxNum = getMaxNum();
			connect();
//			//����̹� Ŭ���� �ε�
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			//�����ͺ��̽� ����
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
			//SQL ���� ��ü �����
			pstmt = con.prepareStatement("insert into contact(num,name,phone,email,birthday)" +"values(?,?,?,?,?)");
			//����ǥ�� ���� ���ε�
			//pstmt.setInt(1, contact.getNum());
			//pstmt.setInt(1, getMaxNum() + 1);
			pstmt.setInt(1, maxNum + 1);
			pstmt.setString(2, contact.getName());
			pstmt.setString(3, contact.getPhone());
			pstmt.setString(4, contact.getEmail());
			pstmt.setDate(5, contact.getBirthday());
			
			//select�� ������ ������ executeUpdate�� ����
			//�������� ������� ���� ������ ������ ����
			
			int r = pstmt.executeUpdate();
			if(r == 1) {
				result = true;
			}
			
//		}catch(Exception e)
//	{
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}finally
//	{
//		try {
//			if (pstmt != null)
//				pstmt.close();
//			if (con != null)
//				con.close();
//		} catch (Exception e) {
//		}
//	}
			close();
		}catch (Exception e) {}
		return result;
	}

	@Override
	public boolean updateContact(Contact contact) {
		boolean result = false;

		connect();
		try {
			//SQL ����
		pstmt = con.prepareStatement("update contact " + "set name = ?, phone = ?, email = ?, birthday = ?" + " where num = ?");
		//����ǥ�� ���� �����͸� ���ε�
		pstmt.setString(1, contact.getName());
		pstmt.setString(2, contact.getPhone());
		pstmt.setString(3, contact.getEmail());
		pstmt.setDate(4, contact.getBirthday());
		pstmt.setInt(5, contact.getNum());
		//SQL ����
		int r = pstmt.executeUpdate();
		//��� ���
		if(r > 0) {
			result = true;
		}
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		//finally ���ص� �Ѿ�ͼ� ���ص� ��
		close();

		return result;
	}

	@Override
	public boolean deleteContact(int num) {
		boolean result = false;
		connect();
		try {
			pstmt = con.prepareStatement("delete from contact " + "where num = ? ");
			pstmt.setInt(1, num);
			int r = pstmt.executeUpdate();
			if(r > 0) {
				result = true;
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		close();
		return result;
	}

	@Override
	public List<Contact> readAllContact() {
		//�о�� �����͸� �����ϱ� ���� ����Ʈ ����
		List<Contact> list = new ArrayList<Contact>();
		connect();
		try {
			//contact ���̺� �ִ� ��ü �����͸� �������� SQL ���� ��ü�� �����մϴ�.
			pstmt = con.prepareStatement("select num, phone, name, email, birthday from contact");
			//select ���� ����
			rs = pstmt.executeQuery();
			
			//�ݺ����� �̿��ؼ� �����͸� �о List�� ����
			while(rs.next()) {
				Contact contact = new Contact();
				contact.setNum(rs.getInt("num"));
				contact.setPhone(rs.getString("phone"));
				contact.setName(rs.getString("name"));
				contact.setEmail(rs.getString("email"));
				contact.setBirthday(rs.getDate("birthday"));
				//���� �����͸� ����Ʈ�� ����
				list.add(contact);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		close();
		return list;
	}
	
	//name �÷��� �Ű������� �־��� �����Ͱ� ���Ե� �����͸� ��ȸ
	@Override
	public List<Contact> nameContact(String name) {
		List<Contact>list = new ArrayList<Contact>();
		connect();
		try {
			//contact ���̺��� name �÷��� name�� ���� ���Ե�
			//�����͸� ��ȸ�ϴ� SQL �����
			pstmt = con.prepareStatement("select * from contact where name like ?");
			//����ǥ�� �����͸� ���ε� �ϱ�
			pstmt.setString(1, "%" + name.toUpperCase() +"%");
			//SQL �����ϱ�
			rs = pstmt.executeQuery();
			//�����͸� �о list�� �����ϱ�
			while(rs.next()) {
				Contact contact = new Contact();
				contact.setNum(rs.getInt("num"));
				contact.setPhone(rs.getString("phone"));
				contact.setName(rs.getString("name"));
				contact.setEmail(rs.getString("email"));
				contact.setBirthday(rs.getDate("birthday"));
				list.add(contact);
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		close();
		return list;
	}

}
